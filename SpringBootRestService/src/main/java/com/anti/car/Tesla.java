package com.anti.car;

import org.springframework.stereotype.Service;

@Service
public class Tesla implements Car {

	@Override
	public String drive() {
		// TODO Auto-generated method stub
		return "Driving Tesla Car...";
	}

}
