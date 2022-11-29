package com.anti.product.bo;

import com.anti.product.dao.ProductDAO;
import com.anti.product.dao.ProductDAOImpl;
import com.anti.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();  // must be static!!!! create only once !!!!
	
	@Override
	public void create(Product product) {
		dao.create(product);

	}

	@Override
	public Product find(int id) {
		// TODO Auto-generated method stub
		System.out.println("eljut ide : "+id);
		return dao.read(id);
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
