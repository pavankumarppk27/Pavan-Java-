package com.java;

import org.junit.jupiter.api.Test;
import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class FluxAndMonoBackPressureTest {
	
	@Test
	public void backPressureTest() {
		
		Flux<Integer> range = Flux.range(1,5).log();
		
		StepVerifier.create(range)
		            .expectSubscription()
		            .thenRequest(1)
		            .expectNext(1)
		            .thenRequest(1)
		            .expectNext(2)
		            .thenCancel()
		            .verify();
		
	}
	
	@Test
	public void backPressure() {
	
		Flux<Integer> range = Flux.range(1, 7)
				                  .log();
		
		range.subscribe(val->System.out.println("val is:"+val)
				         , (e)->System.err.println(e)
				         ,()->System.out.println("Done")
				         ,(subscription->subscription.request(2)));		
	}
	@Test
	public void backPressure_cancel() {
	
		Flux<Integer> range = Flux.range(1, 7)
				                  .log();
		
		range.subscribe(val->System.out.println("val is:"+val)
				         , (e)->System.err.println(e)
				         ,()->System.out.println("Done")
				         ,(subscription->subscription.cancel()));		
	}
	
	@Test
	public void customized_BackPressure() {

		Flux<Integer> range = Flux.range(1, 22).log();
		
		range.subscribe(new BaseSubscriber<Integer>() {
			@Override
			protected void hookOnNext(Integer value) {

				request(1);
				System.out.println("Value recieved is:" + value);
				if (value == 10) {
					cancel();
				}
			}

		});
		
		
		
		
		
		
	
	}
}
