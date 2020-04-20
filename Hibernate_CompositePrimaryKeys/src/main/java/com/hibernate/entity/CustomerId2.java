package com.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;


//key class
//key class must be implement Serializable interface.
@Data
@Embeddable
public class CustomerId2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String email;

}
