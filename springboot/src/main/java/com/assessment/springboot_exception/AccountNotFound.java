package com.assessment.springboot_exception;

public class AccountNotFound extends RuntimeException{
	
	public AccountNotFound(String msg) {
		super(msg);
	}
}
