package com.anti.springboot.databasedemo.springdatabasedemo;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;




@SpringJUnitConfig(SpringDatabasedemoApplicationTests.class)
class SpringDatabasedemoApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	
	@Test
	void givenAppContext_WhenInjected_ThenItShouldNotBeNull() {
	    assertNotNull(applicationContext);
	    
	    System.out.println(applicationContext);
	}
}
