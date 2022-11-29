package com.anti.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anti.controller.Library;
import com.anti.repository.LibaryRepository;

//Separeted it is busness logic

@Service 
public class LibraryService {

	
	@Autowired
	LibaryRepository repo;
	
	public String buildId(String isbn, int aisle) {
		
		return isbn + aisle;
	}
	
	
	public boolean  checkBookAlredyExist(String id) {
		Optional<Library> lib =  repo.findById(id);
		
		if(lib.isPresent())
			return true;
		else 
			 return false;
	}
}
