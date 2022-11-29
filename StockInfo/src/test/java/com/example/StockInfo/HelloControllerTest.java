package com.example.StockInfo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.anti.StockInfo.controllers.HelloControler;
import com.anti.StockInfo.services.WelcomeService;

class HelloControllerTest {

	@Test
	void testHello() {
		
		HelloControler controller = new HelloControler();
		
		assertEquals("Hello Munyi", controller.hello("Munyi"));
	}

}
