package com.anti.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.anti.product.dto.Product;


public class ProductDAOImpl implements ProductDAO {

	
	 Map<Integer, Product> products = new  HashMap<>();
	
	@Override
	public void create(Product product) {
		System.out.println("eljut ide:"+product);
		products.put(product.getId(),  product);

	}

	@Override
	public Product read(int id) {
		System.out.println("eljut id is !!"+id);
		System.out.println(products.get(1));
		
		products.forEach((key, value) -> System.out.println(key + " " + value));
		
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}


//mvn install -DskipTests ha nem akarjuk teszteket futatni
//normal build mvn install 
//execute cmd line package java -cp target\summaven-1.0-SNAPSHOT.jar com.anti.App 12 56	
//create project mvn archetype:generate -DgroupId=com.anti -DartifactId=summaven -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false	
