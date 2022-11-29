package com.anti.car;

import org.springframework.stereotype.Service;

@Service

//@Component – Identifies a Java Class that is to be registered as a Spring Bean
//@Controller or @RestController – Web Layer services like mapping HTTP request to handler methods and processing response
//@Repository – Vendor neutral Exception Translation Service on DAO Classes – DataAcessException
//@Configuration – Java based configuration/code representing a factory to create Spring beans
//@Service – does nothing special, What? I’m confused!
// http://mvpjava.com/component-vs-service-spring/
public class SedanCar implements Car {

	@Override
	public String drive() {
	
		return "Driving Sedan Car...";
	}

}
