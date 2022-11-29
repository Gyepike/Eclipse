package com.anti.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/Alien?serverTimezone=UTC&useSSL=false";
		String user = "hbstudent";
		String password = "hbstudent"; 
		String driver = "com.mysql.jdbc.Driver"; 
	
		try {
			
			System.out.println("Connect to db"+ url);
			//Class.forName("com.mysql.jdbc.Driver"); 
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
