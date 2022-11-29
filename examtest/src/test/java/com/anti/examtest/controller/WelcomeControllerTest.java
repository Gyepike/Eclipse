package com.anti.examtest.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.anti.examtest.service.WelcomeService;

class WelcomeControllerTest {

	
	@Test
	void shouldWelcome() {
		WelcomeService welcome = Mockito.mock(WelcomeService.class);
		when(welcome.getwelcome("John")).thenReturn("Welcome John");
		WelcomeController welcomeController = new WelcomeController(welcome);
		assertEquals("Welcome John", welcomeController.welcome("John"));
		
	}

}
