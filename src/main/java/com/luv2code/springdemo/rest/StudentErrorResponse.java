package com.luv2code.springdemo.rest;

public class StudentErrorResponse {

	private int status;
	private String message;
	private long timeStamp;
	
	public StudentErrorResponse() {  //No argument constructor
		
	}

	public StudentErrorResponse(int status, String message, long timeStamp) {
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	
	
	
	
	
}
