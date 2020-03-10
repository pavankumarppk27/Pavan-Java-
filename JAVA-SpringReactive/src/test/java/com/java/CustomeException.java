package com.java;

public class CustomeException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public CustomeException(Throwable error) {
		// TODO Auto-generated constructor stub
		this.message=error.getMessage();
	}
	

}
