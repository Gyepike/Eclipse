package com.anti.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.anti.mvcstudent.dao.*;
import com.anti.mvcstudent.dto.Student;


@WebServlet("/StudentService")
public class StudentService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // get list util class
		List<Student> students =  StudentDataUtil.studentList();
	    
		// create session
		RequestDispatcher dispatcher = request.getRequestDispatcher("view_students.jsp");
		
	    HttpSession session =  request.getSession();
		
	    session.setAttribute("students", students);
	    
		// redirect getdispatcher
		dispatcher.forward(request, response);
		///response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
