package com.java;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;
import reactor.test.scheduler.VirtualTimeScheduler;

public class VirtualizingTimeTest {
	
	@Test
	public void testWithOutVirtualTime() {
		
		Flux<Long> interval = Flux.interval(Duration.ofSeconds(1))
				                  .take(3);
	
		StepVerifier.create(interval.log())
		            .expectSubscription()
		            .expectNext(1l,2l,3l)
		            .verifyComplete();
		
	}
	
	@Test
	public void testWithVirtualTime() {
		
		VirtualTimeScheduler.getOrSet();
		
		Flux<Long> interval = Flux.interval(Duration.ofSeconds(1))
				                  .take(3);
	
		StepVerifier.withVirtualTime(()->interval.log())
		            .expectSubscription()
		            .thenAwait(Duration.ofSeconds(3))
		            .expectNext(1l,2l,3l)
		            .verifyComplete();
		
	}
	
	

}
