package com.anti.springboot.databasedemo.basic;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("kutya")
public class Dog implements Animals {

	@Override
	public void makeSound() {
		System.out.println("Vau Vau");

	}

}
