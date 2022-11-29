package com.anti.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.anti.product.dto.Product;



public class ProductDAOImplTest {

	
	// Product DAO tszteli ugyn az package !!!
	//com.anti.product.dao
	@Test
	public void createShouldCreateAProduct() {
		ProductDAOImpl dao = new ProductDAOImpl();
		
		Product product = new Product();
		product.setId(1);
		product.setName("PS4");
		product.setDescription("Best console ever!");
		product.setPrice(1000);
		
		
		Product product1 = new Product();
		product1.setId(2);
		product1.setName("PS5");
		product1.setDescription("New console");
		product1.setPrice(2000);
		
		
		dao.create(product);
		dao.create(product1);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("PS4", result.getName());
		
		Product result1 = dao.read(2);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(".m2 Local folder for Maven Repo hidden !! where maven installed ");
		System.out.println("Run configuration you can skip test !!");
		System.out.println();
		
		
	}
    // extract select new Product ctrl +1 cretae pleadany
}
