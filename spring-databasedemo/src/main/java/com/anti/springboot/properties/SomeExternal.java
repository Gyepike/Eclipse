package com.anti.springboot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternal {
	
	@Value("${external.service.url}")
	private String url;
	
	
	public String returnUrl() {
		
		return url;
	}

}
