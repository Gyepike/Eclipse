package com.anti.controller.greeting;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anti.car.Car;

@RestController
// when REST called it should be come here  

public class GreetingController {
	
	// localhost:8080/greetings?name=Munyi
	
	@Autowired
	Greeting greet;
	
	@Autowired
	AddResponse add;
	
	//@Qualifier("tesla") // Must be smallcase !!! not Tesla it is by name!! tesla ref varibale name !!
	//@Autowired
	//Car car;  // by type
	// Car tesla by name  
	
	private  Car car;
	AtomicLong counter = new AtomicLong();
	/*
	@Autowired   // constructor injection
	public  GreetingController(@Qualifier("tesla")  Car car) {
		  this.car = car;
	}
     */
  
	@Autowired   // setter injection
	public void setCar(@Qualifier("tesla")  Car car) {
		this.car = car;
	}

	 //query parameter
	@GetMapping("/greetings")
	public Greeting greeting(@RequestParam(defaultValue = "Stranger") String name) {
	
		greet.setContent("Iam learning Spring " + name);
		greet.setId(counter.incrementAndGet());
		greet.test();
		
		return greet;
	}

	
	@GetMapping("/car")
	public String car() {
		return car.drive();
	}
	
	

}
