package com.anti.StockInfo.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anti.modell.Student;



@RestController
public class StudentControler {

	// crud create read update delete
	// post create
	// get read
	// put update
	// delete
	// MediaType.APPLICATION_XML_VALUE, need parser

	// localhost:8080/student
	@GetMapping(path = "/student", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Student hello() {

		return new Student("Munyi ", "Mazsola Manó :)");

	}
	
	@GetMapping(path = "/students", produces = { MediaType.APPLICATION_XML_VALUE })
	private List<Student> getstudent() {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Munyi", "Manó"));
		students.add(new Student("Munyó", "Manó"));
		students.add(new Student("Tibi", "bácsi"));
		students.add(new Student("Mama", "Mama"));
		
		
		return students;
	}
    
	
	// localhost:8080/student/anti/peti 
	// @PathVarible needed to binde varible to url
	@GetMapping("/student/{firstName1}/{lastName1}")
	public Student studenPathVariable(@PathVariable("firstName1") String firstName, 
			@PathVariable("lastName1")  String lastName ) {

		return new Student(firstName, lastName);

	}
	
	// rest api to handle query paramert 
	
	//http://localhost:8080/student2?firstname=Alma&lastname=Manó
	@GetMapping("/student2")
	public Student studenQueryParam(@RequestParam(name = "firstname", defaultValue = "Munyi") String firstName, 
			@RequestParam(name = "lastname", defaultValue = "Manó")  String lastName ) {

		return new Student(firstName, lastName);

	}
	
	
}
