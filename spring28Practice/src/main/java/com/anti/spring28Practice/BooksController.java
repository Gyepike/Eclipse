package com.anti.spring28Practice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	
	private List<Book>  getAllBooks() {
	
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book(1, "Picture in house", "Lovecraft"));
		books.add(new Book(2, "Verne Jules", "10 000 milies in the sea"));
		books.add(new Book(3, "Stephen King", "It"));
		books.add(new Book(3, "Rejto Jenő", "3+5 testőr"));
		
		return books;
	}
	 
}
