package com.java;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class FluxAndMonoFilterTest {

	List<String> list = Arrays.asList("Spring", "SpringBoot", "Reactive");

	@Test
	public void filterTest() {

		Flux<String> fromIterable = Flux.fromIterable(list)
				                        .filter(str->str.startsWith("Sp")).log();
		
		StepVerifier.create(fromIterable)
		            .expectNext("Spring", "SpringBoot")
		            .verifyComplete();
		
	}

}
