package com.levelofhierarchy.servicce;

import org.springframework.stereotype.Service;

import com.levelofhierarchy.model.Product;

@Service
public interface ProductService {
	
	String save(Product product);

}
