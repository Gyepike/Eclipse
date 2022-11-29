package com.anti.springboot.databasedemo.springdatabasedemo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.anti.springboot.mochito.SomeMochito;
import com.anti.springboot.mochito.*;




class SomeBuisnesTest {

	
	static Logger logger = LoggerFactory.getLogger(SomeBuisnesTest.class);
	
	@Test
	void testFindTheGeatestFromAllData() {
		
		DataService data = mock(DataService.class);
		
		when(data.retirveAllData()).thenReturn(new int[] {45, 7, 8 , 90, 12,}); 
	   
		
		SomeMochito mochito =  new SomeMochito(data);
		
		int great = mochito.findTheGeatestFromAllData();
		//System.out.println(great);
		
		logger.debug(" Great :" + great  );
		assertEquals(45 * 2, great);
	}
	
	@Test
	void testFindTheLeastFromAllData() {
		
		DataService data = mock(DataService.class);
		
		when(data.retirveAllData()).thenReturn(new int[] {45, 7, 8 }); 
	   
		
		SomeMochito mochito =  new SomeMochito(data);
		
		int great = mochito.findTheGeatestFromAllData();
		//System.out.println(great);
		
		assertEquals(45 , great);
	}

}
