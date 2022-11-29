package com.anti;


public class GreetingImpl implements Greeting {

	@Override
	public String greet(String name) {

		if(name == null || name.length() == 0) {
			throw new IllegalArgumentException();
		}
		return "Hallo " + name;
	}

}
