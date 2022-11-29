	package com.anti.springboot.databasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.anti.springboot.databasedemo.basic.Peting;

@SpringBootApplication
@ComponentScan("com.anti.springboot.databasedemo.basic")
public class SpringDatabasedemoApplication {

	
	//http://localhost:8080/h2-console/
	public static void main(String[] args) {
		
		ConfigurableApplicationContext run = SpringApplication.run(SpringDatabasedemoApplication.class, args);
		
		System.out.println("Data Base");
		
	    Peting p =	run.getBean(Peting.class);
	    Peting p1 =	run.getBean(Peting.class);
		//Peting p = new Peting(new Dog());
		
		
		p.makeSound(); 
		p.getMano().makeSound();
		
		//System.out.println(p);
		//System.out.println(p1);
		
		
	}

}
