package com.anti.examtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anti.examtest.service.WelcomeService;


@RestController
public class WelcomeController {

	private WelcomeService welcomeService;
	
	
	public WelcomeController(WelcomeService welcomeService) {
		this.welcomeService = welcomeService;
	}

	//http://localhost:8080/welcome
	// localhost:8080/welcome?name=Munyi
	@GetMapping("/welcome")
	public String welcome(@RequestParam(defaultValue = "Stranger" ) String name) {
		
		//return  String.format("Welcome %s", name) ;
		return welcomeService.getwelcome(name);
	}
}
