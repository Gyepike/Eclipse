package com.anti.StockInfo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anti.modell.Greeting;

//crud create read update delete 

//post create 
//get read 
//put update 
// delete 

@RestController // @Controller implement both @ResponseBody
public class GreetingControler {

	// localhost:8080/hello?name=Munyi

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	// REST end point get hhtp method
	@GetMapping("/great")
	public Greeting hello(@RequestParam(value = "name", defaultValue = "Munyi") String name) {

		return new Greeting(counter.incrementAndGet(), String.format(template, name));

	}

}
