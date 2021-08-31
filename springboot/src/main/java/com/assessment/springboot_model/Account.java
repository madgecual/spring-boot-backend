package com.assessment.springboot_model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@OneToOne(mappedBy="acctNo")
	@Column(name="Account_ID")
	private int acctId;

	@Column(name="User_Name", unique=true)
	private String uname;
	
	@Column(name="Password")
	private String pass;
	
	@Column(name="Role", columnDefinition = "boolean default true") //false = admin
	private Boolean role;

	public Account() {
		
	}
	
	public Account(String uname, String pass, Boolean role) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.role=role;
	}

	public int getAcctId() {
		return acctId;
	}

	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Boolean getRole() {
		return role;
	}

	public void setRole(Boolean role) {
		this.role = role;
	}
}
