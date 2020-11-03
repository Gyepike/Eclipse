package com.anti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Mukodik: ").append(request.getContextPath());
		response.setContentType("text/html; charset=utf-8");
	    
		int outNumber =  Integer.parseInt(request.getParameter("firstNumber")) + Integer.parseInt(request.getParameter("secondNumber"));
		PrintWriter out = response.getWriter();
		out.println("<meta charset=\"utf-8\" />");
		out.println("<html> <body>");
		out.println("�ssze ad :"+ request.getParameter("firstNumber") + " " + " + " + request.getParameter("secondNumber")) ;
		out.println(" Vegerdmeny " +outNumber);
		out.println("</br>");
		out.println("</body> </html>");
	
	}



}
