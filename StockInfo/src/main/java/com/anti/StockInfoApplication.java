package com.anti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StockInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockInfoApplication.class, args);
		System.out.println("REST OUT");
	}
	
	

}
