package com.anti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SqrtServlet
 */
@WebServlet("/SqrtServlet")
public class SqrtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("Hello SqrtServer");
		out.println("Multiply");
		out.println(request.getAttribute("multiply"));
		out.println();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


}