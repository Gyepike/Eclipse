package com.anti.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollage {

	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("collage.xml"); 
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(CollageConfig.class);
		
		
		System.out.println(" XML Loaded ");
		
		College college = context.getBean("collageBean",College.class); //metohid name id for bean !!! 
       
		college.hello();
		
		System.out.println(" Collage Created  " + college) ;
		

	
	}

}
