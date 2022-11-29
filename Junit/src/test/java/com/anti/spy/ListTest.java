package com.anti.spy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

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

class ListTest {
	
	@Spy
	List<String> mylist = new ArrayList();

	
	@BeforeEach 
	public void init() {
		AutoCloseable openMocks = MockitoAnnotations.openMocks(this);
	}
	@Test
	void test() {
		//fail("Not yet implemented");
		mylist.add("Munyi");
		mylist.add("Mami");
		
		doReturn(3).when(mylist).size();
		
		assertSame(3, mylist.size());
		System.out.println(mylist.size());
	}

}
