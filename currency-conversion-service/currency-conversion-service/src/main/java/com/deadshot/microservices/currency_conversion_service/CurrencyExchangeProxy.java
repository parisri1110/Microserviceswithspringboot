package com.deadshot.microservices.currency_conversion_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * From currency conversion we will be calling currency exchange
 * so it is inside currencyconversion
 * */
/** in application.properties we provided spring.application.name=currency-exchange
 * that's why name is given
 * */

@FeignClient(name = "currency-exchange" , url="localhost:8000")
public interface CurrencyExchangeProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retreiveExchangeValue(@PathVariable String from, @PathVariable String to);
}
