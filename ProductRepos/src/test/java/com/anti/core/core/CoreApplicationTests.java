package com.anti.core.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import com.anti.core.core.entities.Alma;
import com.anti.core.core.entities.Product;
import com.anti.core.core.repo.ProductRepo;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CoreApplicationTests {

	@Autowired
	ProductRepo repo;
	

	@Autowired
    Alma alma;


	private Iterable<Product> findAll;

	void contextLoads() {
		 
	}

	/*
	@Test 
	@Order(1)
	public void testCreate() {
		System.out.println("testCreate");
	    Product product = new Product();
	    
	    alma.setType("Jonatan");
	    alma.setType("Goldden");
		
		//product.setId(1);
		product.setName("Golden");
		product.setDesc("Fruit");
		product.setPrice(1200d);
		
		repo.save(product);
		alma.toString();
		System.out.println(alma);
		
	}
	*/
	/*
	@Test
	@Order(2)   
	public void test() {
		System.out.println("test");
		
		Optional<Product> findById = repo.findById(1);
		
		Product p2  = findById.get();
		
		System.out.println(p2);
		
		Product product = repo.findById(1).get();
		
		assertNotNull(product);
		assertNotNull(p2);
		
		assertEquals("IPhone", p2.getName());
		
		System.out.println(product.toString());
		
	}
	
	
	@Test
	@Order(3)   
	public void testUpdate() {
		Product product = repo.findById(1).get();
		product.setPrice(4000d);
		repo.save(product);
		System.out.println(product);
		
	}
	
	@Test
	@Order(4)
	public void count() {
		System.out.println("Total record(s) ==> "+repo.count());
		
		
	}
	
	@Test
	@Order(5)
	public void delete() {
		System.out.println("Apple !!");
		System.out.println(alma);
		if(repo.existsById(1)) {
			System.out.println("Existing ");
			repo.deleteById(1);
		}
		
	}
	*/
	
	/*
	@Test
	public void testfindByName() {
		
		System.out.println("----------byName-----------");
		List<Product> products = repo.findByName("Munyó");
		System.out.println(products);
		products.forEach(p -> System.out.println(p.getName()));
		System.out.println("----------byNameandDesc-----------");
		
		products = repo.findByNameAndDesc("Mama", "Manó");
		System.out.println(products);
		products.forEach(p -> System.out.println(p.getPrice()));
		System.out.println("----------GreaterThan-----------");
		products = repo.findByPriceGreaterThan(5d);
		System.out.println(products);
		products.forEach(p -> System.out.println(p.getName()));
		
		
	}
	
	@Test
	public void testfindByDescfindByNameContains() { 
		System.out.println("----------Containst-----------");
		List<Product>  products = repo.findByNameContains("T");
		System.out.println(products);
		products.forEach(p -> System.out.println(p.getName()));
	 }
	
	@Test
	public void testfindByPriceBetween() { 
		
		System.out.println("----------Between-----------");
		List<Product> products = repo.findByPriceBetween(20d, 20d);
		System.out.println(products);
		products.forEach(p -> System.out.println(p.getName()));
	 }
	
	*/
	//https://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-creating-database-queries-from-method-names/
	
	@Test
	@Order(1)
	public void findByDescLik() { 
		
		System.out.println("----------Like-----------");
		List<Product> products = repo.findByDescLike("%a%");
		System.out.println(products);
		products.forEach(p -> System.out.println(p.getName()));
		System.out.println("----------Like-----------");
	 }
	
	@Test
	@Order(2)
	public void findByInIdsList() { 
		
		System.out.println("----------IN------------");
		/*List<Integer> list = new ArrayList<> (); 
		list.add(3);
		list.add(1);
		*/
		List<Product> products = repo.findByIdIn(Arrays.asList(3,4,2,8));
		System.out.println(products);
		products.forEach(p -> System.out.println(p.getName()));
		System.out.println("----------IN------------");
	 }
	
	
	@Test
	@Order(3)
	
	public void findAllPageing() { 
		System.out.println("----------Page------------");
		//Pageable firstPageWithTwoElements = PageRequest.of(0, 2);
		
		Page<Product> results = repo.findAll(PageRequest.of(1, 3));
		System.out.println(results);
		results.forEach(p -> System.out.println(p.getName()));
		
		System.out.println("----------Page------------");
		 //results = repo.findAll(PageRequest.of(0, 3, Sort.by(Direction.DESC,"price")));
		 results.forEach(p -> System.out.println(p.getName()+" :"+p.getPrice()));
		System.out.println("----------Page------------");
	}
	
	
	@Test
	@Order(1)
	public void findAllShort() { 
		System.out.println("----------OrderByDesc------------");
	    //repo.findAll(Sort.by(Direction.ASC, "name", "price")).forEach( (p) -> System.out.println(p.getName()+" "+p.getPrice()));
		repo.findAll(Sort.by(Sort.Order.desc("name"), Sort.Order.asc("price"))).forEach((p) -> System.out.println(p.getName()+" " + p.getPrice()));
	    System.out.println("----------OrderByDesc------------");
	}
	
	@Test
	@Order(5)
	public void pageFinadAllpage() { 
		System.out.println("----------PageOrderByDescNameAndASCPrice------------");
	    //repo.findAll(Sort.by(Direction.ASC, "name", "price")).forEach( (p) -> System.out.println(p.getName()+" "+p.getPrice()));
		Pageable sortedByPriceDescNameAsc = 
				  PageRequest.of(0, 8, Sort.by("name").descending().and(Sort.by("price").ascending()));
		
		repo.findAll(sortedByPriceDescNameAsc).forEach((p) -> System.out.println(p.getName()+" " + p.getPrice()));
	    System.out.println("----------PageOrderByDescNameAndASCPrice-------------");
	    
	}
	
	@Test
	@Order(6)
	public void repoOrderbyNamedescPriceAsc() { 
		System.out.println("----------WithRepo------------");
	    //repo.findByNameOrderByNameDescPriceAsc().forEach((p) -> System.out.println(p.getName()+" " + p.getPrice()));
		repo.findAllByOrderByNameDescPriceAsc().forEach(((p) -> System.out.println(p.getName()+" " + p.getPrice())));
	    System.out.println("----------Page------------");
	    
	}
}
