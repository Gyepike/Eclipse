package com.anti.core.core.entities;

import org.springframework.stereotype.Component;

@Component
public class Alma {
	
	private String type;
	
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Alma [type=" + type + "]";
	}

}
