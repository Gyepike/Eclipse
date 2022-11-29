package com.anti.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
//@Component I would warn you not to mix Spring Bean and JPA entities in one class/usecase because:
//Spring Beans are instantiated and managed by Spring // Entities are managed by JPA provider
//@Table(name="Storage2") // cannot use LibraryDemo first part have Library!!
// if not given it is search Library TABLe!!!
public class Library {
	
	
    public Library(String book_name, String id, String isbn, int aisle, String author) {
		this.book_name = book_name;
		this.id = id;
		this.isbn = isbn;
		this.aisle = aisle;
		this.author = author;
	}
   
    public Library() {
    	
    } 
	@Column(name="book_name")
	private String book_name;
    @Id
    @Column(name="id")
	private String id;
    @Column(name="isbn")
	private String isbn;
    @Column(name="aisle")
	private int aisle;
    @Column(name="author")
	private String author;
    
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getAisle() {
		return aisle;
	}
	public void setAisle(int aisle) {
		this.aisle = aisle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Library [book_name=" + book_name + ", id=" + id + ", isbn=" + isbn + ", aisle=" + aisle + ", author="
				+ author + "]";
	}
	
}
