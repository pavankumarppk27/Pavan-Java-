package com.java;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class SpringReactiveEx {

	@Test
	public void fluxEx() {
		
		Flux<String> just = Flux.just("Pavan","kumar","Paladugu")
				               // .concatWith(Flux.error(new RuntimeException("Exception Occured")))
		                        .concatWith(Flux.just("After Error"));
		                        //.log();
		
		just.subscribe(System.out::println,e->System.err.println(e),()->System.out.println("completed"));
	}
	@Test
	public void fluxVerify() {
		
		Flux<String> just = Flux.just("spring","springboot","reactive");
		
		StepVerifier.create(just)
		            .expectNext("spring")
		            .expectNext("springboot")
		            .expectNext("reactive")
		            .verifyComplete();		
	}
	
	@Test
	public void fluxVerify_error() {
		
		Flux<String> just = Flux.just("spring","springboot","reactive")
				                .concatWith(Flux.error(new RuntimeException("Runtime Exception Occured")));
		
		StepVerifier.create(just)
		            .expectNext("spring")
		            .expectNext("springboot")
		            .expectNext("reactive")
		           // .expectError(RuntimeException.class)
		            .expectErrorMessage("Runtime Exception Occured")
		            .verify();
		
		
	}	
	
	@Test
	public void fluxVerify_next() {
		
		Flux<String> just = Flux.just("spring","springboot","reactive")
				                .concatWith(Flux.error(new RuntimeException("Runtime Exception Occured")));
		
		StepVerifier.create(just)
		            .expectNext("spring","springboot","reactive")  
		           // .expectError(RuntimeException.class)
		            .expectErrorMessage("Runtime Exception Occured")
		            .verify();
		
	}	
	
	
	@Test
	public void fluxElementsCount() {
		
		Flux<String> just = Flux.just("spring","springboot","reactive")
				                .concatWith(Flux.error(new RuntimeException("Runtime Exception Occured")));
		
		StepVerifier.create(just)
		            .expectNextCount(3)
		           // .expectError(RuntimeException.class)
		            .expectErrorMessage("Runtime Exception Occured")
		            .verify();	
	}	
	
	
	@Test
	public void monoTest() {
		
		Mono<String> just = Mono.just("Spring Reactive");
		
		StepVerifier.create(just)
		            .expectNext("Spring Reactive")
		            .verifyComplete();
		
		
	}
	
	
	@Test
	public void mono_Erro_Test() {
		
		Mono<String> just = Mono.just("Spring Reactive");
		
		StepVerifier.create(Mono.error(new RuntimeException("new Runtime exception"))
		.log()  )          
		.expectError(RuntimeException.class)
		            .verify();
				 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
