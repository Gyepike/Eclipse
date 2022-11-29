package com.anti.service;



import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.anti.model.StockWrapper;



@SpringBootTest

class StockSeviceTest {

	@Autowired
	StockSevice stockService;
	
	@Test
	void invokeStockService() {
		StockWrapper stock = stockService.findStock("AAPL");
	   
		System.out.println(stock);
		
		System.out.println(stockService.finalprice(stock));
		System.out.println("AAPL :"+stock.getStock().getStats());

			System.out.println("AAPL :");
		
	}
	
	

}
