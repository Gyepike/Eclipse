package com.anti.core.core;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.anti.core.core.entities.Customer;
import com.anti.core.core.repo.CustomerRepo;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CustomerTest {
	
	@Autowired
	CustomerRepo repo;

	
	@Test
	@Order(1)
	void testCreate() {
		
		System.out.println("----------Create-----------");
		Customer cust = new Customer();
		
	
		cust.setName("Munyi");
		cust.setEmail("munyo@gmail.com");
		
		
		//repo.save(cust);
		
		System.out.println("----------Create-----------");
	}

	
	@Test
	@Order(2)
	void findByNameAndEmail() {
		System.out.println("----------findbyNameandMail-----------");
		List<Customer> customers = repo.findByNameAndEmail("Munyi","munyo@gmail.com");
		
		System.out.println(customers);
		System.out.println("----------findbyNameandMail-----------");
	}
	

	@Test
	@Order(3)
	void findByNameLike() {
		System.out.println("----------findbyNameLike-----------");
		List<Customer> customers = repo.findByNameLike("%o%");
		
		System.out.println(customers);
	}
	

	@Test
	@Order(4)
	void findByidIn() {
		System.out.println("----------findbyId-----------");
		List<Customer> customers = repo.findByidIn(Arrays.asList(2,4,5,6));
		
		System.out.println(customers);
		System.out.println("----------findbyId-----------");
	}
	
	
}
