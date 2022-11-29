package com.anti.dao;

import org.springframework.stereotype.Component;

@Component
public class LibraryDAO {


	private String book_name;

	private String id;
   
	private String isbn;
 
	private int aisle;

	private String author;

	public String getBook_name() {
		return book_name;
	}

	public String getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getAisle() {
		return aisle;
	}

	public String getAuthor() {
		return author;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setAisle(int aisle) {
		this.aisle = aisle;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "LibraryDAO [book_name=" + book_name + ", id=" + id + ", isbn=" + isbn + ", aisle=" + aisle + ", author="
				+ author + "]";
	}
	
}
