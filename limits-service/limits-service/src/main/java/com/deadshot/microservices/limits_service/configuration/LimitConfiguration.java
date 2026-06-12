package com.deadshot.microservices.limits_service.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class LimitConfiguration {

	
	private int minimum;
	
	private int max;

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "LimitConfiguration [minimum=" + minimum + ", max=" + max + "]";
	}

	public LimitConfiguration(int minimum, int max) {
		super();
		this.minimum = minimum;
		this.max = max;
	}

	public LimitConfiguration() {
		super();
	}
	
	
}
