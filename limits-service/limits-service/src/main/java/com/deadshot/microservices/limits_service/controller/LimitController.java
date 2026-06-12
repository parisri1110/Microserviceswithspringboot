package com.deadshot.microservices.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deadshot.microservices.limits_service.bean.Limits;
import com.deadshot.microservices.limits_service.configuration.LimitConfiguration;

@RestController
public class LimitController {

	@Autowired
	private LimitConfiguration limitConfiguration;
	
	@GetMapping("/limits")
	public Limits retrieveLimit()
	{
		return new Limits(limitConfiguration.getMinimum(), limitConfiguration.getMax());
		//return new Limits(1,100);
	}
}
