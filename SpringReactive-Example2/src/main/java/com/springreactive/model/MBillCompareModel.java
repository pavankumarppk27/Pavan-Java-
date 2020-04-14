package com.springreactive.model;


import lombok.Data;

@Data
public class MBillCompareModel {
	
	private Double totalCharges;
	private String invoicePeriod;
	private Double currBalanceFwd;
	private Double totalCurrOneTimeChg;
	private Double totalCurrMonChg;
	private Double totoalCurrTaxChg;
	private String currentMonthDesc;
	private String prevMonthDesc;
	private Double totatalCurrentCharges;
	private Double prevTotalCharges;
	

}
