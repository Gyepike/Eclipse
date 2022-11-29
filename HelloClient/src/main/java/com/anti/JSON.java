package com.anti;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON {

	
	private static ObjectMapper objectMapper = getObjectMapper();
	
	
	private static ObjectMapper getObjectMapper() {
		
		
		ObjectMapper defultObjectMapper = new ObjectMapper(); 
		
		return defultObjectMapper;
		
	}
	
	private static JsonNode parse(String src) throws IOException   {
		
		return objectMapper.readTree(src);
	}
}
