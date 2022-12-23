package com.anti.core.core.repo;

import org.springframework.data.repository.CrudRepository;

import com.anti.core.core.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
