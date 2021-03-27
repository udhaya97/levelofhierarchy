package com.levelofhierarchy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.levelofhierarchy.model.Product;
import com.levelofhierarchy.model.ProductRoles;
import com.levelofhierarchy.model.Roles;
import com.levelofhierarchy.servicce.ProductRoleService;
import com.levelofhierarchy.servicce.ProductService;

@RestController
public class ProductRoleController {
	
	@Autowired
	private ProductRoleService prodRoleService;
	
	@Autowired
	private ProductService prodService;
	@GetMapping("/product")
	public String getVal()
	{
		return prodRoleService.getAllProdRoles().get(0).getStatus();
	}

	@GetMapping("/hai")
	public String getValue()
	{
		return "Hai Udhay";
	}
	
	@GetMapping("/product/{prodId}/{roleId}")
	public String getValuebByid(@PathVariable("prodId") int prodId,@PathVariable("roleId") int roleId )
	{
		
		ProductRoles prodRo =prodRoleService.getProdRoleById(prodId, roleId);
		return prodRo.getStatus();
	}
	
	@PostMapping("/product/{prodId}/{roleId}")
	public String saveProdRole(@RequestBody ProductRoles prodRol,@PathVariable("prodId") int prodId,@PathVariable("roleId") int roleId)
	{
		Product prod = new Product();
		Roles roles = new Roles();
		prod.setProdId(prodId);
		roles.setRoleId(roleId);
		prodRol.setProduct(prod);
		prodRol.setRoles(roles);
		prodRoleService.save(prodRol);
		
		return "data saved successfully";
	}
	
	@PostMapping("/product")
	public String saveProd(@RequestBody Product prod)
	{
		String get = prodService.save(prod);
		
		return get;
	}
}
