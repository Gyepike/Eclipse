	package com.anti.springboot.databasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.anti.springboot.databasedemo.basic.Peting;
import com.anti.springboot.properties.SomeExternal;

import javassist.ClassClassPath;

@SpringBootApplication
@ComponentScan("com.anti.springboot.properties")
//app.properties
@PropertySource("classpath:app.properties")
public class SpringDatabasedemoApplicationProperty {

	
	//http://localhost:8080/h2-console/
	public static void main(String[] args) {
		
		ConfigurableApplicationContext run = SpringApplication.run(SpringDatabasedemoApplicationProperty.class, args);

		
		SomeExternal  p =	run.getBean(SomeExternal.class);
	
        System.out.println(p.returnUrl());		
	
        
	}

}
