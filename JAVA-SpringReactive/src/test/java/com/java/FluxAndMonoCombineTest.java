package com.java;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class FluxAndMonoCombineTest {

	
	
	@Test
	public void combineUsingMerge() {
		
		Flux<String> flux=Flux.just("A","B","C");		
		Flux<String> flux2=Flux.just("D","E","F");
		
		Flux<String> merge = Flux.merge(flux,flux2);

		
		//StepVerifier.create(merge.log()).expectSubscription().expectNext("A", "B", "C", "D", "E", "F").verifyComplete();
		
	}
	
			
	
	@Test
	public void combineUsingMerge_withDelay() {
		
		//merge won't fallow order it won't wait for ohter flux
		
		Flux<String> flux=Flux.just("A","B","C").delayElements(Duration.ofSeconds(1));		
		Flux<String> flux2=Flux.just("D","E","F").delayElements(Duration.ofSeconds(1));
		
		Flux<String> merge = Flux.merge(flux,flux2);

		
		StepVerifier.create(merge.log())
		            .expectSubscription()
		            .expectNextCount(6)
		            //.expectNext("A","B","C","D","E","F")
		            .verifyComplete();
		
	}
	
	
	@Test
	public void combineUsingConcat() {
		
		Flux<String> flux=Flux.just("A","B","C");	
		Flux<String> flux2=Flux.just("D","E","F");
		
		Flux<String> merge = Flux.concat(flux,flux2);

		
		StepVerifier.create(merge.log())
		            .expectSubscription()
		           // .expectNextCount(6)
		            .expectNext("A","B","C","D","E","F")
		            .verifyComplete();
		
	}
	

	@Test
	public void combineUsingC_withDelay() {
		
		//concat will fallow order
		
		Flux<String> flux=Flux.just("A","B","C").delayElements(Duration.ofSeconds(1));		
		Flux<String> flux2=Flux.just("D","E","F").delayElements(Duration.ofSeconds(1));
		
		Flux<String> merge = Flux.concat(flux,flux2);

		
		StepVerifier.create(merge.log())
		            .expectSubscription()
		            .expectNextCount(6)
		            //.expectNext("A","B","C","D","E","F")
		            .verifyComplete();
		
	}
	
	@Test
	public void combineUsing_zip() {
		
		Flux<String> flux=Flux.just("A","B","C");	
		Flux<String> flux2=Flux.just("D","E","F");
		
		Flux<String> merge = Flux.zip(flux,flux2,(t1,t2)->{
			return t1.concat(t2);
		});//AD,BE,CF

		
		StepVerifier.create(merge.log())
		            .expectSubscription()
		           // .expectNextCount(6)
		            .expectNext("AD","BE","CF")
		            .verifyComplete();
		
	}
	
	
}
