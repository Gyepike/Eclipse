package com.anti.examtest.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	public String getwelcome(String name) {
	
			return String.format("Welcome %s", name);
		
	}
}
