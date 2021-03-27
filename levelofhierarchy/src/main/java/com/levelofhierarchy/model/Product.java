package com.levelofhierarchy.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	private int prodId;
	private String prodName;
	private int quality;
	
	@OneToMany(mappedBy = "product")
	private List<ProductRoles> productRoles;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public List<ProductRoles> getProductRoles() {
		return productRoles;
	}

	public void setProductRoles(List<ProductRoles> productRoles) {
		this.productRoles = productRoles;
	}

	public Product(int prodId, String prodName, int quality) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.quality = quality;
	}

	public Product() {
		super();
	}
	
	
	

}
