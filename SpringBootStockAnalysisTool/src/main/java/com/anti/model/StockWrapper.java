package com.anti.model;

import java.time.LocalDateTime;

import yahoofinance.Stock;

public class StockWrapper {
     
	

	private final Stock stock;
	private final LocalDateTime lastAccessed;
	
	
	public StockWrapper(final Stock stock) {
		this.stock = stock;
		lastAccessed = LocalDateTime.now();
	}


	public Stock getStock() {
		return stock;
	}


	public LocalDateTime getLastAccessed() {
		return lastAccessed;
	}


	@Override
	public String toString() {
		return "StockWrapper [stock=" + stock + ", lastAccessed=" + lastAccessed + "]";
	}
	
}
