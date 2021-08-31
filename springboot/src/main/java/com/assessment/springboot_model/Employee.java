package com.assessment.springboot_model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="Employee_ID")
	private int id;
	
	@Column(name="First_Name")
	private String fname;
	
	@Column(name="Last_Name")
	private String lname;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Birthday")
	private String bday;
	
	@Column(name="Phone_Number")
	private String phoneNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private int acctNo;
	
	public int getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	public Employee() {
		
	}
	
	public Employee(String fname, String lname, String email, String bday, String phoneNo) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.bday = bday;
		this.phoneNo = phoneNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBday() {
		return bday;
	}
	public void setBday(String bday) {
		this.bday = bday;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", email=" + email + ", bday=" + bday + ", phoneNo="
				+ phoneNo + ", acctNo=" + acctNo + "]";
	}

}
