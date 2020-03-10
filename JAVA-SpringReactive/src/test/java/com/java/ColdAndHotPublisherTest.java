package com.java;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.ConnectableFlux;
import reactor.core.publisher.Flux;

public class ColdAndHotPublisherTest {

	@Test
	public void coldPublisherTest() throws InterruptedException {

		List<String> list = Arrays.asList("A", "B", "C", "D");

		Flux<String> fromIterable = Flux.fromIterable(list);

		fromIterable.subscribe(val -> System.out.println(val));

		Thread.sleep(2000);
		fromIterable.subscribe(val -> System.out.println(val));

		Thread.sleep(4000);
		fromIterable.subscribe(val -> System.out.println(val));

	}
	@Test
	public void hotPublisherTest() throws InterruptedException {

		List<String> list = Arrays.asList("A", "B", "C", "D");

		Flux<String> fromIterable = Flux.fromIterable(list).delayElements(Duration.ofSeconds(1));
    
		ConnectableFlux<String> publish = fromIterable.publish();
		
		publish.connect();
		
		fromIterable.subscribe(val->System.out.println("subscribe-1:"+val));
		Thread.sleep(2000);
		fromIterable.subscribe(val->System.out.println("subscribe-2:"+val));//does not emit the values from beginning
		Thread.sleep(4000);
		fromIterable.subscribe(val->System.out.println("subscribe-2:"+val));


	}

}
