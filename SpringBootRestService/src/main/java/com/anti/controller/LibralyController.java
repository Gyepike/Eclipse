package com.anti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anti.controller.greeting.AddResponse;
import com.anti.repository.LibaryRepository;
import com.anti.service.LibraryService;


/* 
  {
   "isbn" : "studio",
   "aisle" : 201622,
   "author" : "shetty",
   "book_name" : "selenium"   
   }
 */
@RestController
public class LibralyController {

	@Autowired
	LibaryRepository repo;

	
	@Autowired
	AddResponse add;
	
	@Autowired
	LibraryService libraryService;
	
	
	// localhost:8080/addBook
	// request we use body post not get parameter 
	
	
	
	//y. The consumes attribute of @RequestMapping can specify the media types acceptable to @RequestBody parameter. 
	//The @RequestBody can be used with HTTP methods POST, PUT etc.
	
	@PostMapping("/addBook")
	public  ResponseEntity<AddResponse>  addBook(@RequestBody Library library) {
		
		HttpHeaders headers = new HttpHeaders();
		
		String id = libraryService.buildId(library.getIsbn(),library.getAisle());
		
		
		if (!libraryService.checkBookAlredyExist(id)) {
		
		library.setId(id);
		
		
		
		headers.add("unique", id);
		
		
		
	    repo.save(library);
	    
	    add.setId(library.getIsbn()+library.getAisle());
	    add.setMsg("POST USE REQUEST BODY ! " +HttpStatus.CREATED.toString());
	    
	    
	   
	    return  new ResponseEntity<AddResponse>(add, headers, HttpStatus.CREATED);
		} 
		{
			  add.setMsg("Already Exsit ! ");
			  return  new ResponseEntity<AddResponse>(add, headers, HttpStatus.ACCEPTED);
		}
	   
	}
	
	//PATH parameter 
	@GetMapping("/getBook/{id}")
	public void getBookbyId(@PathVariable(value="id") String id)
	{
		System.out.println(id);
	}
	
}
