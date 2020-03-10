package com.java;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public final class FluxAndMonoTimeTest {
	
	@Test
	public void infiniteSequence() {
		
		Flux<Long> interval = Flux.interval(Duration.ofMillis(10))
				                  .log();//starts from 0
		
		interval.subscribe(val->System.out.println("value:"+val));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Test
	public void infiniteSequence_test() {
		
		Flux<Long> interval = Flux.interval(Duration.ofMillis(100))
				                  .take(3)
				                  .log();//starts from 0
			
		StepVerifier.create(interval)
		            .expectSubscription()
		            .expectNext(0L,1L,2L)
		            .verifyComplete();
		
	}
	
	@Test
	public void infiniteSequence_test_delay() {
		
		Flux<Long> interval = Flux.interval(Duration.ofMillis(100))
				                  .delayElements(Duration.ofSeconds(1))
				                  .map(i->i)
				                  .take(3)
				                  .log();//starts from 0
				
		StepVerifier.create(interval)
		            .expectSubscription()
		            .expectNext(0L,1L,2L)
		            .verifyComplete();
		
	}
	
	
	

}
