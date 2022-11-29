package com.anti.bo;

import com.anti.dto.Product;

public interface ProductBo {

	
	 void create(Product product);
	 
	 Product findProduct(int id);
}
