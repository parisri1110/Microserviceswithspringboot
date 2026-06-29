package com.deadshot.microservices.currency_exchange_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {

	Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

//	Now let's say this microservice
//	which we are calling is down temporarily
//	and sometimes you know that
//	if you invoke the same thing multiple times it
//	might give you a response back.
//	And in those kind of situations you can go for a Retry.
//	So if you add @Retry

	@GetMapping("/sample-api")
	//@Retry(name = "sample-api", fallbackMethod = "hardcordedResponse")
	
	
	
	//If a microservice is down then what does the circuit breaker do? Hey, this microservice calls, everything is failing.Then why do I need to really call it and add load to it? Why can't I return a default response back directly? So that is what the circuit breaker does. It'll open the circuitand it'll directly return a response back. Now you might be wondering, how do I knowif the microservice is back up and I can call it again?

	@CircuitBreaker(name = "default", fallbackMethod = "hardcordedResponse")
	
	
	//What is rate limiting? Basically, rate limiting is all about saying in 10 seconds I want to only allow 10,000 calls to the sample API.So that's what we are setting in here.So we are setting a time period and during that time period I only want toSo this specific API method, I only wantto allow 10,000 calls.That is what is called rate limiting.
	@RateLimiter(name = "default")
	
	//configure how many concurrent calls are allowed.That's called Bulkhead.For each of the APIs inside a microservice you can configure a Bulkhead.So Bulkhead and let's just say name is equal to default
	@Bulkhead(name = "default")
	
	public String sampleApi() {
		/*
		 * logger.info("sample api call"); ResponseEntity<String> forEntity = new
		 * RestTemplate().getForEntity("http://localhost:8080/dummy", String.class);
		 * return forEntity.getBody();
		 */
		return "sample-api";
	}
	
	public String hardcordedResponse( Exception ex)
	{
		return "fallback-Response";
	}
}
