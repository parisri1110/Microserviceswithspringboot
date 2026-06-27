package com.deadshot.microservices.currency_conversion_service;

import java.math.BigDecimal;

public class CurrencyConversion {

	private Long id;
	
	private String from;
	private String to;


private BigDecimal conversionMultiple;
private BigDecimal quantity;
private BigDecimal totalCalculateAmount;
	
	private String environment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getTotalCalculateAmount() {
		return totalCalculateAmount;
	}

	public void setTotalCalculateAmount(BigDecimal totalCalculateAmount) {
		this.totalCalculateAmount = totalCalculateAmount;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public CurrencyConversion(Long id, String from, String to,  BigDecimal quantity,BigDecimal conversionMultiple,
			BigDecimal totalCalculateAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculateAmount = totalCalculateAmount;
		this.environment = environment;
	}

	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + ", quantity=" + quantity + ", totalCalculateAmount=" + totalCalculateAmount
				+ ", environment=" + environment + "]";
	}

	public CurrencyConversion(Long id, String from, BigDecimal conversionMultiple, BigDecimal totalCalculateAmount,
			String environment) {
		super();
		this.id = id;
		this.from = from;
		this.conversionMultiple = conversionMultiple;
		this.totalCalculateAmount = totalCalculateAmount;
		this.environment = environment;
	}

	public CurrencyConversion() {
		super();
	}
	
	
}
