package com.anti.spring28Practice;

import java.net.URL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring28PracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(Spring28PracticeApplication.class, args);
		
		for (String name : con.getBeanDefinitionNames()) {
			// System.out.println(name);
		}
		

       // http://localhost:8080/actuator
		// http://localhost:8080/
		// http://localhost:8080/actuator/health
		
	}

}
