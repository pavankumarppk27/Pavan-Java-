package com.java.reactive.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;


@Configuration
public class RouterFunctionConfig {
	
	/*
	 * public RouterFunction<ServerResponse> route(SampleHandlerFunction
	 * sampleHandlerFunction){
	 * 
	 * 
	 * return RouterFunctions
	 * 
	 * .route(GET("/functional/flux").and(accept(MediaType.APPLICATION_JSON)),
	 * sampleHandlerFunction::flux); }
	 * 
	 */}
