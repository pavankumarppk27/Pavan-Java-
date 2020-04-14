package com.springreactive.model;


import lombok.Data;

@Data
public class CreditDetailsModel {
	
	
	private String creditCardNumber;
	private String expiryMonth;
	private String expiryYear;
	private String creditCardType;
	
	private DataAllowanceBarModel dataAllowanceBarModel;


}
