package com.anti.springboot.databasedemo.basic;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // @Qualifier("kutya") erősebb !!! mint primary miatt macska lenne !!!
public class Cat implements Animals {

	@Override
	public void makeSound() {
		System.out.println("Miao Miao");

	}

}
