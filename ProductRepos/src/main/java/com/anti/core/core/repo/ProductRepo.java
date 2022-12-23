package com.anti.core.core.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.anti.core.core.entities.Product;
import java.lang.String;
import java.util.List;

// CrudRepository<Product, Integer> without page / sort
// https://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-part-six-sorting/
public interface ProductRepo extends PagingAndSortingRepository<Product, Integer> {
	
       List<Product> findByName(String name); 
       List<Product> findByNameAndDesc(String name, String desc);        
       List<Product> findByPriceGreaterThan(Double price); 
       List<Product> findByNameContains(String name); 
       List<Product> findByPriceBetween(Double price1, Double price2 ); 
       List<Product> findByDescLike(String desc ); 
       List<Product> findByIdIn(List<Integer> id); 
       List<Product> findAllByOrderByNameDescPriceAsc();
      // public List<StudentEntity> findAllByOrderByIdAsc();
      //findByTitleOrderByTitleAscDescriptionDesc(String title);
       
 }

