package com.java.reactive.controller;


import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class FluxAndMonoController {
	
	
	@GetMapping("/flux")
	public Flux<Integer> returnFlux(){
		
		
		return Flux.just(1,2,3,4)
				   .delayElements(Duration.ofSeconds(1))
				   .log();
	}
	@GetMapping(value="/streamFlux",produces =MediaType.APPLICATION_STREAM_JSON_VALUE )
public Flux<Integer> returnStreamFlux(){
		
		
		return Flux.just(1,2,3,4)
				   .delayElements(Duration.ofSeconds(1))
				   .log();
	}
	
	@GetMapping("/getMono")
	public Mono<String> returnMono(){
		
		return Mono.just("Pavan").log();
	}
	
	

}
