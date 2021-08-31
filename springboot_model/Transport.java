package com.assessment.springboot_model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transport")
public class Transport {
	
	@Id
	@Column(name="Car_Plate_Number")
	private String carPlate;
	
	@Column(name="Driver_First_Name")
	private String driverFname;
	
	@Column(name="Driver_Last_Name")
	private String driverLname;
	
	public Transport() {
		
	}

	public Transport(String carPlate, String driverFname, String driverLname) {
		super();
		this.carPlate = carPlate;
		this.driverFname = driverFname;
		this.driverLname = driverLname;
	}

	public String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

	public String getDriverFname() {
		return driverFname;
	}

	public void setDriverFname(String driverFname) {
		this.driverFname = driverFname;
	}

	public String getDriverLname() {
		return driverLname;
	}

	public void setDriverLname(String driverLname) {
		this.driverLname = driverLname;
	}

	@Override
	public String toString() {
		return "Transport [carPlate=" + carPlate + ", driverFname=" + driverFname + ", driverLname=" + driverLname
				+ "]";
	}

}
