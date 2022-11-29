package com.anti.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anti.product.bo.ProductBOImpl;
import com.anti.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	 ProductBOImpl bo = new ProductBOImpl();
	 Product  product =	bo.find(Integer.parseInt(request.getParameter("id")));
	 
	 PrintWriter out = response.getWriter();
	 System.out.println(product);
	 out.println("Product details!");
	 out.println(product.getDescription());
	 out.println(product.getName());
	 out.println(product.getPrice());
	 
	}

	
}
