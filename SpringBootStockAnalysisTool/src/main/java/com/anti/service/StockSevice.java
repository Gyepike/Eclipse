package com.anti.service;

import java.io.IOException;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.anti.model.StockWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import yahoofinance.YahooFinance;



//https://rapidapi.com/blog/how-to-use-an-api-with-spring-resttemplate/


@Service
public class StockSevice {
	
	Logger logger  = LoggerFactory.getLogger(StockSevice.class);
	
	
	@EventListener
	public void eventLinstener(ApplicationStartedEvent event) {
		
		logger.info("Application Started BEGIN");
		Started();
		//Started2();
		//System.out.println(findStock("AAPL"));
		logger.info("Application Started END");
		
	}
	
	
	public StockWrapper findStock(final String ticker)
	{
		try {
			
			return new StockWrapper(YahooFinance.get(ticker));
			
		} catch ( IOException e) {
			System.out.println("hiba ");
		}
		
		return null;
	}
	
	
	public BigDecimal finalprice(final StockWrapper stock) 
	{
		
		try {
			return stock.getStock().getQuote(true).getPrice();
		} catch (IOException e) {
			
			System.out.println("Stock not found!");
		}
		
		return null;
	}
	
	// https://stackabuse.com/how-to-convert-json-object-to-java-object-with-jackson/
	// https://rapidapi.com/citeamaccount/api/currencyscoop/
	
	public void Started()  {
		System.out.println("Munyi szereti Munyót! ");
		
		OkHttpClient client = new OkHttpClient();

		/*
		Request request = new Request.Builder()
			.url("https://currencyscoop.p.rapidapi.com/currencies")
			.get()
			.addHeader("X-RapidAPI-Key", "207d91ed2bmshe3f7b387c31920cp1588d4jsn002f7402aa8b")
			.addHeader("X-RapidAPI-Host", "currencyscoop.p.rapidapi.com")
			.build()
			;
		*/
		
		Request request = new Request.Builder()
				.url("https://api.apilayer.com/fixer/convert?to=HUF&from=EUR&amount=1")
				.get()
				.addHeader("apikey", "IMMy5Mf4lmd0K9Qib9nc7gwFCjKdyKdH")
				.build()
			;
		
		
	
		System.out.println("AAA"+request.toString());

		try {
			
			Response response = client.newCall(request).execute();
			
		
			ObjectMapper mapper = new ObjectMapper();
			
			System.out.println("Currency " +response.body().string());
		    
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//https://www.youtube.com/watch?v=Vqgghm9pWe0
	public void Started2()  {
	   
	  System.out.println("Satred 2");
	}
	

}



