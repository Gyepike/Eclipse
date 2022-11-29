package com.anti.bo;

import com.anti.dao.ProductDAO;
import com.anti.dao.ProductDAOImpl;
import com.anti.dto.Product;

public class ProductBoImpl implements ProductBo {

	private static ProductDAO dao = new ProductDAOImpl();
	// must be static not create new dao ONLY ONE or use spring boot 
	
	@Override
	public void create(Product product) {
      dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

}
