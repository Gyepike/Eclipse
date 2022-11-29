package com.anti;


//https://medium.com/swlh/getting-json-data-from-a-restful-api-using-java-b327aafb3751
// https://rapidapi.com/blog/how-to-use-an-api-with-spring-resttemplate/
//https://rapidapi.com/blog/how-to-use-an-api-with-java/
/**
 * Hello world!
 *
 *
 *https://www.youtube.com/watch?v=5MmlRZZxTqk
 *tutorial 
 * https://www.youtube.com/watch?v=5MmlRZZxTqk
 * 
 * 
 */
public class App {

	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World!");
	
        try {
        	
        	GetData.teszt2();
			
        } catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}


//GetData.teszt2();

/*
String jsonString = "{\"phonetype\":\"N95\",\"cat\":\"WP\"}";
ObjectMapper mapper = new ObjectMapper();
JsonNode node = mapper.readTree(jsonString);	
String phoneType = node.get("phonetype").asText();
String cat = node.get("cat").asText();

System.out.println(cat);
*/
