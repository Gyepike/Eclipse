package com.anti.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCtest {

	public static void main(String... errors) {
		
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("jdbc.xml");
		 //  ConfigurableApplicationContext applicationContext
		 //  ApplicationContext context
		
		 System.out.println("context done");
		 
		 StudentDAO student = context.getBean("student", StudentDAO.class);
		 
		 student.seletAllRows();
		// student.deleteRecord(7);
		// student.seletAllRows();
		 
		 //((ClassPathXmlApplicationContext) context).close();
		 
		 context.close();
		 
		 //context.registerShutdownHook();
	}

}
