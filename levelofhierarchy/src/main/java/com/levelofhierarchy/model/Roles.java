package com.levelofhierarchy.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Roles {

	@Id
	private int roleId;
	private String roleName;
	
	@OneToMany(mappedBy = "roles")
	private List<ProductRoles> prodRules;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<ProductRoles> getProdRules() {
		return prodRules;
	}

	public void setProdRules(List<ProductRoles> prodRules) {
		this.prodRules = prodRules;
	}

	public Roles(int roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public Roles() {
		super();
	}
	
	
}
