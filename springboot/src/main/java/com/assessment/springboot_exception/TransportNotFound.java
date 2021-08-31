package com.assessment.springboot_exception;

public class TransportNotFound extends RuntimeException{
	
	public TransportNotFound(String msg) {
		super(msg);
	}
}
