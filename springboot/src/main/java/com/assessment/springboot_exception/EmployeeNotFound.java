package com.assessment.springboot_exception;

public class EmployeeNotFound extends RuntimeException{
	
	public EmployeeNotFound(String msg) {
		super(msg);
	}

}
