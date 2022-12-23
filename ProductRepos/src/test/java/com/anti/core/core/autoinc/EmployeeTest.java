package com.anti.core.core.autoinc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.anti.core.core.entities.Employee;
import com.anti.core.core.repo.EmployeeRepo;

@SpringBootTest
class EmployeeTest {
	
	@Autowired
	EmployeeRepo repo;

	@Test
	void test() {
       Employee emp = new Employee();
       
      // emp.setId(1);
       emp.setName("Munyi Manó");
       
       repo.save(emp);
       
	}

}
