package com.anti.springboot.databasedemo.springdatabasedemo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.anti.springboot.mochito.DataService;
import com.anti.springboot.mochito.SomeMochito;




//@ExtendWith(SpringExtension.class)
@SpringJUnitConfig

class MockitoAnnotationTest {

	@Test
	void elso() {
		System.out.println("hello");
	}

	@Mock
	private List list;

	@Mock
	private DataService data;

	@InjectMocks
	SomeMochito mochito;

	@Test
	public void masodik() {
		System.out.println("Kuki");

		// arrange
		when(list.get(1)).thenReturn("Second element");
		when(list.get(2)).thenReturn("Third element");

		String secondElementFromList = (String) list.get(1);
		//assertEquals( (String) "Second element", (String)  secondElementFromList);
		
		System.out.println(secondElementFromList);
        
		assertTrue(secondElementFromList.equals("Second element"));
	}

	@Test
	public void testQuery() {

		when(data.retirveAllData()).thenReturn(new int[] { 45, 7, 8, 90, 12, });
		int great = mochito.findTheGeatestFromAllData();
		assertEquals(45 * 2, great);

		// assert
		// assertEquals("Second element", secondElementFromList);
	}

}
