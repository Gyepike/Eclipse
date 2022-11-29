package com.anti.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anti.springbackend.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
      
}
