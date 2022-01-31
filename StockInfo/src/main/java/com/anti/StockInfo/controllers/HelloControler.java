package com.anti.StockInfo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
	
	
	//localhost:8080/hello?name=Munyi
	
		@GetMapping("/hello")
		public String hello(@RequestParam(value = "name", defaultValue = "Munyi") String name)  {
			
			
			return String.format("Hello %s", name);

		}

}
