package com.anti.bo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.anti.bo.exception.BOException;
import com.anti.dao.OrderDAO;
import com.anti.dto.Order;

/*
 * Ok, this is a great article to understand how inheritance practically works.
And in fact the order of variable initialization makes sense : 
Static variables are independent of any created object by definition (that is what they are used for). Therefore, they must be initialized before any object creation, as soon as the class is called. Otherwise it could create a conflict if there is any non-static variable that has "taken" the place of a static one.
And it seems logical to initialize the parent class static variables before the child ones.
Then, when every necessary static variable are initialized, it is time to initialize the non-static variables of the created object before using the constructor to create the object. And as a class is a "blueprint" of each object, you need to build the fondations (the parent class) before building the last bits (in the child class).
Hence the order : 
1.Base class static variable initialization
2.Child class static variable initialization
3.Base class non-static variable initialization
4.Base class constructor
5.Child class non-static variable initialization
6.Child class constructor
I home my "mnemotechnic" explanation will be usefull and not too confusing.
Thanks professor !
 */


class OrderBOImplTest {

	@Mock
	OrderDAO dao;
	
    
	private OrderBOImpl bo;
	
	
	@BeforeEach
	public void setup() {
		AutoCloseable openMocks = MockitoAnnotations.openMocks(this);
		//System.out.println("Run setup! Every Test!!");
		bo = new OrderBOImpl();
		bo.setDao(dao);
	}
	
	@Test
	void placeOrder_should_create_order () throws SQLException, BOException {
		
		
		Order order = new Order();
	
	    when(dao.create(order)).thenReturn(1);
		
	    boolean placeOrder = bo.placeOrder(order);
		
		
		assertTrue(placeOrder);
		int create = verify(dao).create(order);
		
		
	}
	
	@Test
	void placeOrder_should_not_create_order () throws SQLException, BOException {
		Order order = new Order();
	
	    when(dao.create(order)).thenReturn(0);
		
	    boolean placeOrder = bo.placeOrder(order);
		
		
		assertFalse(placeOrder);
		int create = verify(dao).create(order);
		
		
	}

	
	
	@Test
	void placeOrder_should_throwBOexception () throws SQLException, BOException {
		Order order = new Order();
	
	    when(dao.create(order)).thenThrow(SQLException.class);
		
	    
	    assertThrows(BOException.class, () -> {
	    	bo.placeOrder(order);
		}
		)
		;
		
	}
	
	
	
	
	@Test
	void cancelOrder_should_chancell_order() throws SQLException, BOException {
		Order order = new Order();
	
	    when(dao.read(123)).thenReturn(order);
	    when(dao.update(order)).thenReturn(1);
		
	   
	    boolean cancelOrder = bo.cancelOrder(123);
		
		assertTrue(cancelOrder);
		
		verify(dao).read(123);
		verify(dao).update(order);
		
	}
	
	

	@Test
	void cancelOrder_should_NOT_chancell_order() throws SQLException, BOException {
		Order order = new Order();
	
	    when(dao.read(123)).thenReturn(order);
	    when(dao.update(order)).thenReturn(0);
		
	   
	    boolean cancelOrder = bo.cancelOrder(123);
		
		assertFalse(cancelOrder);
		
		verify(dao).read(123);
		verify(dao).update(order);
		
	}

	
	@Test
	void cancelOrder_should_throw_exception_onRead() throws SQLException, BOException {
		
	    when(dao.read(123)).thenThrow(SQLException.class);
	    
	    assertThrows(BOException.class, () -> {
	    	bo.cancelOrder(123);
		}
		)
		;
	    
	}

	@Test
	void cancelOrder_should_throw_exception_onUpdate() throws SQLException, BOException {
		Order order = new Order();
	
	    when(dao.read(123)).thenReturn(order);
	    when(dao.update(order)).thenThrow(SQLException.class);
	    
	
	    //boolean cancelOrder = bo.cancelOrder(123);
	    assertThrows(BOException.class, () -> {
	    	bo.cancelOrder(123);
		}
		)
		;
	
	}
	

}
