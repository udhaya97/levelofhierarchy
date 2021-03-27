package com.levelofhierarchy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.levelofhierarchy.model.ProductRoles;

public interface ProductRolesRepository extends CrudRepository<ProductRoles, Integer> {

	@Query(value="select * from productrole where prod_id=?1 and role_id=?2",nativeQuery = true)
	ProductRoles findByProductAndRoles(int prodId,int roleId);
	
}
