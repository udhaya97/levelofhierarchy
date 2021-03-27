package com.levelofhierarchy.servicce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.levelofhierarchy.model.Product;
import com.levelofhierarchy.model.ProductRoles;
import com.levelofhierarchy.repository.ProductRolesRepository;

@Service


public class ProductRoleServiceImpl implements ProductRoleService {

	@Autowired
	ProductRolesRepository prodRoleRepo;
	
	@Override
	public List<ProductRoles> getAllProdRoles() {
		List<ProductRoles> prodRole = (List<ProductRoles>) prodRoleRepo.findAll();
		
		for (ProductRoles productRoles : prodRole) {
			
			//if()
			
		}
		return prodRole;
	}

	@Override
	public ProductRoles getProdRoleById(int prodId, int roleId) {
		
		int prevRole= roleId-1;
		
		ProductRoles prodRoles = (ProductRoles) prodRoleRepo.findByProductAndRoles(prodId, roleId);
		 int prodRoleId=prodRoles.getProdroleid();
		if(prodRoles.getStatus().equalsIgnoreCase("approved"))
		{
			
			
			prodRoles.setStatus("Already Approved");
		} /*
			 * else if(prodRoles.getStatus().equalsIgnoreCase(" ")) {
			 * prodRoles.setStatus("approved"); prodRoleRepo.save(prodRoles); }
			 */
		
		else
		{
			System.out.println("role id is "+prevRole);
			if(prevRole>10) {
			ProductRoles prodRoless = (ProductRoles) prodRoleRepo.findByProductAndRoles(prodId, prevRole);
			
			if(prodRoless.getStatus().equalsIgnoreCase("approved")) {
				ProductRoles prodRole = new ProductRoles();
				System.out.println("prodroleid "+prodRoles.getProdroleid());
				
				 // prodRole.setProdroleid(prodRoleId); prodRoles.setStatus("approved");
				 prodRoles.setStatus("approved");
				  prodRoleRepo.save(prodRoles);
				 
			prodRoles.setStatus("Approved the request");}
			else
			{
				prodRoles.setStatus("Unable to approve , becuase previous approver not approved");
			}
			}else
			{
				prodRoles.setStatus("approved"); prodRoleRepo.save(prodRoles);
			}
		}
		
		return prodRoles;
	}

	@Override
	public void save(ProductRoles prodRol) {
		// TODO Auto-generated method stub
		prodRoleRepo.save(prodRol);
		System.out.println("data saved");
		
	}

}
