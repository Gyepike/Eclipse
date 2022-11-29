package com.anti.mochito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;





 class MessageService {

    public static String get() {
        return "Hello JUnit 5";
    }

}

class Test {

	
	@BeforeAll
	static void before() {
		System.out.println("Kuki");
	}

	
	@DisplayName("test()")
	void test() {
		//fail("Not yet implemented");
		 assertEquals("Hello JUnit 5", MessageService.get());
		 System.out.println("Test 1 ");
	}

	
	 @DisplayName("Test MessageService.get()")
		@org.junit.jupiter.api.Test
	    void testGet() {
	        assertEquals("Hello JUnit 5", MessageService.get());
	    }
}
