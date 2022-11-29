package com.anti.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// when REST called it should be come here  
public class GreetingController {
	
	// localhost:8080/greetings?name=Munyi
	
	@Autowired
	Greeting greet;
	
	AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greetings")
	public Greeting greeting(@RequestParam(defaultValue = "Stranger") String name) {
	
		// Greeting greeting  = new Greeting () ;
		greet.setContent("Iam learning Spring " + name);
		greet.setId(counter.incrementAndGet());
		greet.test();
		//return  String.format("Welcome %s", name) ;
		
		return greet;
	}

}
