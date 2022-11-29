package com.anti.springboot.databasedemo.basic;

import org.springframework.stereotype.Component;

@Component
public class Mano implements Animals {

	@Override
	public void makeSound() {
		System.out.println("Sír a mamó mert egyedül van !");

	}

}
