package com.springreactive.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class CreditDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String creditCardNumber;
	private String expiryMonth;
	private String expiryYear;
	private String creditCardType;
	public CreditDetailsEntity(String creditCardNumber, String expiryMonth, String expiryYear, String creditCardType) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.creditCardType = creditCardType;
	}
	
	
	public CreditDetailsEntity() {
		// TODO Auto-generated constructor stub
	}
	
}
