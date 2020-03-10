package com.java;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.ParallelFlux;
import reactor.test.StepVerifier;

public class FluxAndMonoFlatMapTest {

	@Test
	public void transformUsingFlatMap() {

		// flateMap-->if you want to call D.B or External Service
		// That returns a Flux for each Element you can for flatMap()
		// flux->s->Flux<String>
		Flux<String> fromIterable = Flux.fromIterable(Arrays.asList("A", "B", "C", "D", "E", "F")).flatMap(s -> {

			return Flux.fromIterable(convertList(s));// A->List(A,NewValue),B->List(B,NewValue)
		})// db or external service call that returns a flux s->Flux<String>
				.log();

		// StepVerifier.create(fromIterable).expectNextCount(12).verifyComplete();

	}

	private List<String> convertList(String s) {
		// TODO Auto-generated method stub

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Arrays.asList(s, "NewValue");
	}

	public void flatMapTest() {

		Flux<String> fromIterable = Flux.fromIterable(Arrays.asList("A", "B", "C", "D", "E", "F"))

				.flatMap(str -> {

					return Flux.just(str);
				});

	}

	@Test
	public void transformUsingFlatMap_usingParallel() {

		// flateMap-->if you want to call D.B or External Service
		// That returns a Flux for each Element you can for flatMap()
		// flux->s->Flux<String>
		// Flux<String> fromIterable = Flux.fromIterable(Arrays.asList("A", "B", "C",
		// "D", "E", "F"))//Flux<String>
		// .window(2)//Flux<Flux<String> (A,B) ,(C,D),(E,F)
		// .flatMap((s)->
		// s.map(this::convertToList).subscribeOn(parallel()))//Flux<List<String>>
		// .flatMap(s->Flux.fromIterable(s))//Flux<String>
		// .log();

	}

	@Test
	public void flatMap_usingParallel() {

		Flux<String> fromIterable = Flux.fromIterable(Arrays.asList("A", "B", "C", "D", "E", "F")).window(2)// Flux<Flux<String>>
				.flatMap(s -> s.map(this::convertList))// Flux<List<String>>
				.flatMap(s -> Flux.fromIterable(s))// Flux<String>
				.log();

		// StepVerifier.create(fromIterable).expectNextCount(12).verifyComplete();

	}

	@Test
	public void flatMap_usingParallel_maintainOrder() {

		// concatMap->it does same as flatMap and it maintains order it is taking 6 sec

		//flatMapSequential ->it is going to be faster and it maintains order also executed parallel it take 2 sec
		Flux<String> fromIterable = Flux.fromIterable(Arrays.asList("A", "B", "C", "D", "E", "F")).window(2)// Flux<Flux<String>>
				/*
				 * .concatMap(s->s.map(this::convertList))//.subscribeOn(parallel())//Flux<List<
				 * String>> .flatMap(s->Flux.fromIterable(s))//Flux<String>
				 */
				.flatMapSequential(s -> s.map(this::convertList))// .subscribeOn(parallel())//Flux<List<String>>
				.flatMap(s -> Flux.fromIterable(s))// Flux<String>
				.log();

		StepVerifier.create(fromIterable).expectNextCount(12).verifyComplete();

	}

}
