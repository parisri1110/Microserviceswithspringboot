package com.deadshot.microservices.limits_service.bean;

public class Limits {

	
	private int max;
	
	private int min;

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public Limits(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}

	@Override
	public String toString() {
		return "Limits [max=" + max + ", min=" + min + "]";
	}

	public Limits() {
		super();
	}
	
}
