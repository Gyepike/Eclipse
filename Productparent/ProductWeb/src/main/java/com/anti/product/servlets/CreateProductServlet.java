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
 * Servlet implementation class CreateProductServlet
 * 
 */
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		Integer price = Integer.parseInt(request.getParameter("price"));
		
		String  name = request.getParameter("name");
		String  desc = request.getParameter("desc");

		
		Product product = new Product();
		
		product.setId(id);
		product.setName(name);
		product.setDescription(desc);
		product.setPrice(price);
		
		
		
		System.out.println(product);
		
		ProductBOImpl bo = new ProductBOImpl();
		
		bo.create(product);
		
		PrintWriter out = response.getWriter();
	    out.println("product created!!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
