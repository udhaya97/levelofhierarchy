package com.levelofhierarchy.servicce;

import java.util.List;

import org.springframework.stereotype.Service;

import com.levelofhierarchy.model.ProductRoles;

@Service
public interface ProductRoleService {
	
	List<ProductRoles> getAllProdRoles();
	
	ProductRoles getProdRoleById(int prodId,int roleId);
	
	void save(ProductRoles prodRol);
	

}
