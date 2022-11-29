package com.anti.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {

	
	
	@Value("${jdbc.url}")
	String url;
	@Value("${jdbc.user}")
	String user ;
	@Value("${jdbc.password}")
	String password;
	@Value("${jdbc.driver}")
	String driver;
	
	
	public void display() {
		System.out.println("JDBCConnection [url=" + url + ", user=" + user + ", password=" + password + ", driver=" + driver + "]");
	}
	
	public void connection() {
		try {
			System.out.println("Try conecction !");
			display();
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection done !!");
			
		} catch (SQLException e) {
			System.out.println("Connection failed !!");
			e.printStackTrace();
		}
		
	}
}
