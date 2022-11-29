package com.anti;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anti.controller.greeting.AddResponse;
import com.anti.controller.Library;
import com.anti.dao.Alien;
import com.anti.dao.LibraryDAO;
import com.anti.repository.LibaryRepository;

@SpringBootApplication

// implements CommandLineRunner 
// Spring boot’s CommandLineRunner interface is used to run a code block only once in application’s lifetime – after application is initialized.
public class SpringBootRestServiceApplication  implements CommandLineRunner {

	// static LibraryDAO libDAO;

	@Autowired
	LibaryRepository repository;
	
	@Autowired
	Alien alien;

	public static void main(String[] args) {

		// ConfigurableApplicationContext context =
		SpringApplication.run(SpringBootRestServiceApplication.class, args);

		
		// libDAO = context.getBean(LibraryDAO.class);

		// Alien alien = context.getBean(Alien.class);
		// Alien alien1 = context.getBean(Alien.class);
		// context nem kell nem simma spring @Component hasznaltuk

		 

		// Cannnot use enity and component !!!
		// libDAO.setAuthor("Verne Gyula");
		// libDAO.setAisle(5);
		// libDAO.setIsbn("A");
		// libDAO.setId(libDAO.getIsbn()+libDAO.getAisle());
		// libDAO.setBook_name("Utazas Holdba2");
		// System.out.println(libDAO);

		System.out.println("Rest Tester !s!!!");
		System.out.println("Hello DEV Tools !!!");

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("commnd line ");
		//alien.show();
		
	}
	
	
//	@Override
//	public  void run(String... args)  {
//		
//		
//
//		
//		Library l  = repository.findById("fdsefr343").get();
//		
//		System.out.println(l.getAuthor());
//		System.out.println(l.getBook_name());
//		//repository.save(new Library("Utazas fold kozepontja .. " , "A3","A",3,"Jules Verne"));
//	    
//		Library en = new Library();
//		
//		
//		en.setAuthor("Verne Gyula");
//		en.setAisle(5);
//		en.setIsbn("A");
//		en.setId(en.getIsbn()+en.getAisle());
//		en.setBook_name("Utazas Holdba");
//		
//		repository.save(en);
//		
//		//List<String> list2=new ArrayList<String>();  
//		
//		 List<Library> list = repository.findAll();
//		 
//		 for (Library library : list) {
//		     // System.out.println(library);	
//		      
//		 }
//		 
//		 //repository.delete(en);
//		 System.out.println(repository.count());
//	}

}
