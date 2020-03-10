package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class FluxMonoFactoryTest {

	List list=Arrays.asList("Spring","SpringBoot","SpringReactive");
	
	@Test
	public void fluxUsingIterable() {
		
		Flux<String> fromIterable = Flux.fromIterable(list).log();
		
		StepVerifier.create(fromIterable)
		            .expectNext("Spring","SpringBoot","SpringReactive")
		            .verifyComplete();
	}
	
	@Test
	public void fluxUsingArray() {
		
		String[] str=new String[] {"spring","spring boot","reactive","java"};
		
		Flux<String> fromArray = Flux.fromArray(str);
		

		StepVerifier.create(fromArray)
		            .expectNext("spring","spring boot","reactive","java")
		            .verifyComplete();
	
	}
	
	@Test
	public void fluxUsingStream() {
		
		Flux<String> fromStream = Flux.fromStream(list.stream());
		
		StepVerifier.create(fromStream)
		            .expectNext("Spring","SpringBoot","SpringReactive")
		            .verifyComplete();
		
		//until verifyComplete() method is called Stream doesn't pass values 
		
	}
	
	@Test
	public void monoUsingJustOrEmpty() {
		
		Mono<String> justOrEmpty = Mono.justOrEmpty(null);
		
		StepVerifier.create(justOrEmpty.log())
	                .verifyComplete();	          	
	}
	
	@Test
	public void monoUsingSupplier() {
		
		Supplier<String> strSuplier=()->"String Supplier";
		
         Mono<String> fromSupplier = Mono.fromSupplier(strSuplier);		
         System.out.println(strSuplier.get());
         
		StepVerifier.create(fromSupplier)
		            .expectNext("String Supplier")
		            .verifyComplete();
		
	}
		
	@Test
	public void fluxByUsingRange() {
		
		Flux<Integer> range = Flux.range(1, 5).log();
		
		StepVerifier.create(range)
		            .expectNext(1, 2,3,4,5)
		            .verifyComplete();
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
