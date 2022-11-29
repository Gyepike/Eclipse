package com.anti.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDAO {

	
	@Value("${jdbc.url}")
	String url;
	@Value("${jdbc.user}")
	String user ;
	@Value("${jdbc.password}")
	String password;
	@Value("${jdbc.driver}")
	String driver;
	
	
	private Connection con;
	
	@PostConstruct
	private void init() throws SQLException {
		System.out.println("First all property set ! DEPENDECI INJECTION ! first : user, url, password, driver ! ");
		System.out.println("After init method executed !! Costructor utan!!" );
		createStudentDBConection();
	}
	
	
  
	public void connectionClose() throws SQLException {
    	
    	System.out.println("Java SE nekunk kell contextetnt letre hozni zarni !!!");
    	System.out.println("Java EE / SPRING  AUTOMATIKUS!!! ");
    	System.out.println("ClassPathXmlApplicationContext ós osztaly van close !! Azert type cast LIST / ARRAYLISt !!");
    	
		    	
    	System.out.println("Connection done !!");
		
		con.close();
	}
	
	  @PreDestroy
    public void destroy() throws SQLException  {
		  System.out.println("inside Destroy method");
		  connectionClose();
		  
	}
    
    public void createStudentDBConection() throws SQLException {
    	
    	display();
    	con = DriverManager.getConnection(url, user, password);
	}
	public void display() {
		System.out.println("StudentDAO [url=" + url + ", user=" + user + ", password=" + password + ", driver=" + driver + "]");
	}
	
	
	
	public void seletAllRows() {
		try {
		    
			//createStudentDBConection(); use @PostConstruct to call itt !!!
			
			Statement stmnt = con.createStatement();
			
			ResultSet rs = stmnt.executeQuery("SELECT * FROM Alien.HostelStudentInfo");
			
		     
			while(rs.next()) {
				int studentId =  rs.getInt(1);
				String studentName = rs.getString(2);       
			    float hosterFee = rs.getFloat(3);
			    String foodType = rs.getString(4);
				
				System.out.println(studentId+" "+studentName+" "+hosterFee+" "+foodType);
			}
			
			//connectionClose();
			
			
		} catch (SQLException e) {
			System.out.println("Connection failed !!");
			e.printStackTrace();
		}
		
	}
	
	
	public void deleteRecord(int studentid) { 
try {
		    
			//createStudentDBConection();
			
			String sqldelete  = "delete from Alien.HostelStudentInfo where Student_id = ?";
			PreparedStatement stmt=con.prepareStatement(sqldelete);  
			
			
			stmt.setInt(1,studentid);
			
			int count =stmt.executeUpdate();  
			System.out.println(count +" records deleted");
			
			//connectionClose();
			
		} catch (SQLException e) {
			System.out.println("Connection failed !!");
			e.printStackTrace();
		}
	}
	
	
}


