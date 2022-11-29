package com.anti.product.dao;

import com.anti.product.dto.Product;

public interface ProductDAO {
     // CRUD implemnets !!!!
	void create(Product product);
	
	Product read(int id);
	
	void update(Product product);
	
	void delete (int id);
}


//mvn install -DskipTests ha nem akarjuk teszteket futatni
//normal build mvn install 
//execute cmd line package java -cp target\summaven-1.0-SNAPSHOT.jar com.anti.App 12 56	
// create project mvn archetype:generate -DgroupId=com.anti -DartifactId=summaven -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false	
