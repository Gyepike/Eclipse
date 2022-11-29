package com.example.StockInfo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.anti.StockInfoApplication;
import com.anti.mochito.DataService;
import com.anti.mochito.SomeMochito;





//@SpringJUnitConfig
//@ExtendWith(SpringExtension.class)


@SpringBootTest
@ContextConfiguration(classes={StockInfoApplication.class})
class MockitoAnnotationTest {

	
	@BeforeAll 
	
	 static void  alma(){
		System.out.println("Alma");
	}
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
