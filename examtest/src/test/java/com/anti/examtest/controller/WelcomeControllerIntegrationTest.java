package com.anti.examtest.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.anti.examtest.service.WelcomeService;



@WebMvcTest
class WelcomeControllerIntegrationTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private  WelcomeService welcomeSevice;
	
	

	
	@Test
	void shouldGetdefultWelcomeMessage() throws Exception {
		when(welcomeSevice.getwelcome("Stranger")).thenReturn("Welcome Stranger!");
		
		mockMvc.perform(get("/welcome"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string("Welcome Stranger!"));
		
		verify(welcomeSevice).getwelcome("Stranger");
		
	}

}
