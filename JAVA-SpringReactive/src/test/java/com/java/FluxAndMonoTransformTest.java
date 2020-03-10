package com.java;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class FluxAndMonoTransformTest {
	
	List<String> list = Arrays.asList("Spring", "SpringBoot", "Reactive");

	
	@Test
	public void transformUsingMap() {
		
		Flux<String> fromIterable = Flux.fromIterable(list)
				                        .map(String::toUpperCase);
		
		StepVerifier.create(fromIterable)
		            .expectNext("SPRING", "SPRINGBOOT", "REACTIVE")
		            .verifyComplete();	
	}
	
	
	@Test
	public void transformUsingMap_Length() {
		
		Flux<Integer> fromIterable = Flux.fromIterable(list)
				                        .map(s->s.length());
		
		StepVerifier.create(fromIterable)
		            .expectNext(6,10,8)
		            .verifyComplete();
		
		

		Flux<Integer> fromIterable2 = Flux.fromIterable(list)
				                        .repeat(1)
				                        .map(s->s.length())
				                        .log();
		
		StepVerifier.create(fromIterable2)
		            .expectNext(6,10,8,6,10,8)
		            .verifyComplete();
		
	}

	
	@Test
	public void transformUsingMap_Filter() {
		
		Flux<String> fromIterable = Flux.fromIterable(list)
				                        .filter(s->s.length()>6)
				                        .map(String::toUpperCase);
		
		StepVerifier.create(fromIterable)
		            .expectNext("SPRINGBOOT", "REACTIVE")
		            .verifyComplete();	
	}
}
