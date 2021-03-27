package com.levelofhierarchy.servicce;

import org.springframework.beans.factory.annotation.Autowired;

import com.levelofhierarchy.model.Product;
import com.levelofhierarchy.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepo;
	@Override
	public String save(Product product) {
		
		productRepo.save(product);
		return "data saved successfully";
	}

}
