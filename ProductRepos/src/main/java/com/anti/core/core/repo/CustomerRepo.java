package com.anti.core.core.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.anti.core.core.entities.Customer;
import java.lang.String;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {
	
	List<Customer> findByNameAndEmail(String Name, String Email);
	List<Customer> findByNameLike(String Name);
	List<Customer> findByidIn(List<Integer> ids);
	List<Customer> findByName(String name);
	
}
