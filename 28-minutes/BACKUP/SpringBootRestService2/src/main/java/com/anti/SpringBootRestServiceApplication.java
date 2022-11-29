package com.anti;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.anti.repository.LibaryRepository;

@SpringBootApplication
public class SpringBootRestServiceApplication implements CommandLineRunner {
    
	@Autowired
	LibaryRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestServiceApplication.class, args);
		System.out.println("Rest Tester !s!!!");
		System.out.println("Hello DEvTools");
		
	}

	@Override
	public  void run(String... args)  {
		
	    repository.findById("fdsefr343").get();
	}

}
