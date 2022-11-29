package com.anti;
//https://www.youtube.com/watch?v=7UlslIXHNsw
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingImplTest {

	private  GreetingImpl greeting;

	@BeforeEach
	public  void setup() {
		System.out.println("Setup Object: created GreetingImpl");
		greeting = new GreetingImpl();
	}

	@Test
	public void greetShouldReturnVAlid() {
		System.out.println("Call :greetShouldReturnVAlid");
		String greet = greeting.greet("Munyi Manó");

        
		assertNotNull(greet);
		assertEquals("Hallo Munyi Manó", greet);

	}

	@Test
	public void greetThrwowException_if_NameisNull() {
		
		System.out.println("Call :greetThrwowException_if_NameisNull");

		assertThrows(IllegalArgumentException.class, () -> {
			greeting.greet(null);
		}

		)
		;

	}

	@Test
	public void greetThrwowException_if_NameisEmpty() {

		System.out.println("Call : greetThrwowException_if_NameisEmpty");
		
		assertThrows(IllegalArgumentException.class, () -> {
			greeting.greet("");
		}

		)
		;
	  }
		
	
        @AfterEach
		public  void teardown() {

		System.out.println("Tear Down Object: Destory GreetingImpl");
		greeting = null;
	    
		}	
        			
     
	}


