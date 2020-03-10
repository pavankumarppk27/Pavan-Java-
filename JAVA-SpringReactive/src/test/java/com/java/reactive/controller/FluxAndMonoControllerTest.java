package com.java.reactive.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.EntityExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.reactive.server.WebTestClient.ListBodySpec;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;


//@WebFluxTest//it will scan the controller and rest controller classes
//@RunWith(SpringRunner.class)
public class FluxAndMonoControllerTest {

	@Autowired
	WebTestClient webTestClient;
	
	
	public void flux_TestApproach1() {
		
		
		Flux<Integer> responseBody = webTestClient.get()
		             .uri("/flux")
		             .accept(MediaType.APPLICATION_JSON_UTF8)
		             .exchange()//invoke the end point
		             .expectStatus().isOk()
		             .returnResult(Integer.class)
		             .getResponseBody();
		
		
		StepVerifier.create(responseBody)
		            .expectSubscription()
		            .expectNext(1)
		            .expectNext(2)
		            .expectNext(3)
		            .expectNext(4)
		            .verifyComplete();
		             
	}
	
	
	
public void flux_TestApproach2() {
		
		
	 ListBodySpec<Integer> hasSize = webTestClient.get()
		             .uri("/streamFlux")
		             .accept(MediaType.APPLICATION_JSON_UTF8)
		             .exchange()//invoke the end point
		             .expectStatus().isOk()
		             .expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
		             .expectBodyList(Integer.class)
		             .hasSize(4);
		           
	}
	
	


public void flux_TestApproach3() {
	
	List<Integer> expectResult=Arrays.asList(1,2,3,4);
	
	 EntityExchangeResult<List<Integer>> returnResult = webTestClient.get()
	             .uri("/flux")
	             .accept(MediaType.APPLICATION_JSON_UTF8)
	             .exchange()//invoke the end point
	             .expectStatus().isOk()
	             .expectBodyList(Integer.class)
	             .returnResult();
	             
	assertEquals(expectResult, returnResult.getResponseBody());
	
}


public void flux_TestApproach4() {
	
	List<Integer> expectResult=Arrays.asList(1,2,3,4);
	
	 webTestClient.get()
	             .uri("/flux")
	             .accept(MediaType.APPLICATION_JSON_UTF8)
	             .exchange()//invoke the end point
	             .expectStatus().isOk()
	             .expectBodyList(Integer.class)
	             .consumeWith(response->{
	            	 assertEquals(expectResult, response.getResponseBody());

	             });
	             
}

}
	
	
	
	
	
	
	

