package com.anti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingImplTest2 {
	
	
	private GreetingImpl greet;

	
	@BeforeEach
	void setup() {
		greet = new GreetingImpl();
       System.out.println("Created Greet Object!!");		
	}
	
	@Test
	void testGreet() {
		
        assertEquals("Hallo Munyi", greet.greet("Munyi"));
	}

}
