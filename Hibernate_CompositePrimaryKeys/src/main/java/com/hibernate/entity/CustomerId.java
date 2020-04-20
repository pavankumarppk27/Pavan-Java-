package com.hibernate.entity;

import java.io.Serializable;

import lombok.Data;


//key class
//key class must be implement Serializable interface.
@Data
public class CustomerId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String email;

}
