package com.example.StockInfo;



import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.anti.StockInfoApplication;
import com.anti.StockInfo.controllers.HelloControler;

//@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers =  HelloControler.class)
@ContextConfiguration(classes={StockInfoApplication.class})
// https://stackoverflow.com/questions/43515279/error-unable-to-find-springbootconfiguration-when-doing-webmvctest-for-spring 
// separted part
class HelloTest {

	@Autowired
	private MockMvc mvc;
	
	
	 
	@Test
	void testHello() throws Exception {
	   RequestBuilder request = MockMvcRequestBuilders.get("/hello");
       MvcResult result = mvc.perform(request).andReturn();
       
       System.out.println(result.getResponse().getContentAsString());
	}
	
	

}
