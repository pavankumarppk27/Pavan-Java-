package com.java;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class HandlingErrors {
	
	@Test
	public void fluxErrorHandling_onErrorResume() {
		
		Flux<String> concatWith = Flux.just("A","B","C")
		    .concatWith(Flux.error(new RuntimeException("Runtime Exceptions")))
		    .concatWith(Flux.just("D"))
		    .onErrorResume(e->{
		    	
		    	System.out.println("Exception is:"+e);
		    	
		    	return Flux.just("Default","Default");
		    	
		    });
		
		
		StepVerifier.create(concatWith.log())
		            .expectSubscription()
		            .expectNext("A","B","C")
		            //.expectError(RuntimeException.class)
		            //.verify();
		          //  .expectNext("D")
		            .expectNext("Default","Defalut")
		            .verifyComplete();	
	}
	
	
	@Test
	public void fluxErrorHandling_onErrorReturn() {
		
		Flux<String> concatWith = Flux.just("A","B","C")
		    .concatWith(Flux.error(new RuntimeException("Runtime Exceptions")))
		    .concatWith(Flux.just("D"))
		    .onErrorReturn("Default");
		
		
		StepVerifier.create(concatWith.log())
		            .expectSubscription()
		            .expectNext("A","B","C")
		            //.expectError(RuntimeException.class)
		            //.verify();
		          //  .expectNext("D")
		            .expectNext("Default","Defalut")
		            .verifyComplete();
		
		
	}
	
	
	@Test
	public void fluxErrorHandling_onErrorMap() {
		
		Flux<String> concatWith = Flux.just("A","B","C")
		    .concatWith(Flux.error(new RuntimeException("Runtime Exceptions")))
		    .concatWith(Flux.just("D"))
		    .onErrorMap((e)->new CustomeException(e));
		
		StepVerifier.create(concatWith.log())
		            .expectSubscription()
		            .expectNext("A","B","C")
		            .expectError(CustomeException.class)
		            .verify();		
	}
	@Test
	public void fluxErrorHandling_onErrorMap_reTry() {
		
		Flux<String> concatWith = Flux.just("A","B","C")
		    .concatWith(Flux.error(new RuntimeException("Runtime Exceptions")))
		    .concatWith(Flux.just("D"))
		    .onErrorMap((e)->new CustomeException(e))
		    .retry(2);
		
		StepVerifier.create(concatWith.log())
		            .expectSubscription()
		            .expectNext("A","B","C")
		            .expectNext("A","B","C")
		            .expectNext("A","B","C")
		            .expectError(CustomeException.class)
		            .verify();		
	}
	
	@Test
	public void fluxErrorHandling_onErrorMap_reTry_backOf() {
		
		Flux<String> concatWith = Flux.just("A","B","C")
		    .concatWith(Flux.error(new RuntimeException("Runtime Exceptions")))
		    .concatWith(Flux.just("D"))
		    .onErrorMap((e)->new CustomeException(e))
		    .retryBackoff(2,Duration.ofSeconds(5));
		
		StepVerifier.create(concatWith.log())
		            .expectSubscription()
		            .expectNext("A","B","C")
		            .expectNext("A","B","C")
		            .expectNext("A","B","C")
		            .expectError(IllegalStateException.class)
		            .verify();		
	}
	
	
	
	

}
