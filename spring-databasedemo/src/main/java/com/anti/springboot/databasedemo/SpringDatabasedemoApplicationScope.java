package com.anti.springboot.databasedemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.anti.springboot.databasedemo.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.anti.springboot.databasedemo.scope")
public class SpringDatabasedemoApplicationScope {

	
	//http://localhost:8080/h2-console/
	//final   Logger logger =  LoggerFactory.getLogger(this.getClass());
	static Logger logger = LoggerFactory.getLogger(SpringDatabasedemoApplicationScope.class);
	
    
	public static void main(String[] args) {
		
		ConfigurableApplicationContext con = SpringApplication.run(SpringDatabasedemoApplicationScope.class, args);
		
		System.out.println("Scope ");
		
		PersonDAO personDao = con.getBean(PersonDAO.class);
		PersonDAO personDao2 = con.getBean(PersonDAO.class);
		
	  
	    logger.info("Defult Singelton scope  Info lever DAO:  {}",personDao );
	    logger.info("Info lever DAO.jdbc:  {}",personDao.getJdbcConnection() );
	    
	    
	    logger.info("Defult Singelton scope  Info lever DAO2 : {}",personDao2 );
	    logger.info("Info lever DAO2.jdbc:  {}",personDao2.getJdbcConnection() );
	    
	    
	    }

}
