package com.levelofhierarchy.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="productrole")
public class ProductRoles {
	
	@Id
	private int prodroleid;
	
	@ManyToOne
	@JoinColumn(name="prodId")
	private Product product;
	@ManyToOne
	@JoinColumn(name="roleId")
	private Roles roles;
	
	private String status;

	

	public int getProdroleid() {
		return prodroleid;
	}



	public void setProdroleid(int prodroleid) {
		this.prodroleid = prodroleid;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public Roles getRoles() {
		return roles;
	}



	public void setRoles(Roles roles) {
		this.roles = roles;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public ProductRoles(int prodroleid, Product product, Roles roles, String status) {
		super();
		this.prodroleid = prodroleid;
		this.product = product;
		this.roles = roles;
		this.status = status;
	}



	public ProductRoles() {
		super();
	}
	
	

}
