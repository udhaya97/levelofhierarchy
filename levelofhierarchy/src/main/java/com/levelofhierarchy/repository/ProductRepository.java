package com.levelofhierarchy.repository;

import org.springframework.data.repository.CrudRepository;

import com.levelofhierarchy.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
