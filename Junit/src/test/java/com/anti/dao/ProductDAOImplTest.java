package com.anti.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.anti.bo.OrderBOImpl;
import com.anti.dto.Product;

class ProductDAOImplTest {

	private ProductDAOImpl dao;
	private Product product;
	
	@Test
	void CreateProduct() {
		
		System.out.println("Call :  Product implement !!");
		
		dao  = new ProductDAOImpl();
		
	    product = new Product();
		
		product.setId(1);
		product.setName("IPhone");
		product.setDesc("very goood !  ");
		product.setPrice(800);
		
		dao.create(product);
		
		
		product = new Product();
		
	
		product.setId(2);
		product.setName("PS4");
		product.setDesc("Perfect Game System for Munyi :) ");
		product.setPrice(400);
		
		
		dao.create(product);
		
		Product result = dao.read(1);
		assertNotNull(result);
		
		assertEquals("IPhone", result.getName());
	
		
		Product result2 = dao.read(2);
		assertNotNull(result2);
		assertEquals("PS4", result2.getName());
		
		
		
		Product result3 = dao.read(1);
		System.out.println(result3);

		Product result4 = dao.read(2);
		System.out.println(result4);
		
		System.out.println(".m2 Local folder for Maven Repo hidden !! where maven installed ");
		System.out.println("Run configuration you can skip test !!");
		System.out.println("USE JUINT !!");
	}

}
