package com.springreactive.model;

import lombok.Data;

@Data
public class PaymentInfoModel {
	
	private String lastPaymentDate;
	private String pastDueBalance;
	private String eCustomerDate;
	private String invoiceDate;
	private Double outStandingBalance;
	private Double billTotalRemitAmount;
	private Double lastPaymentAmount;
	private Double lateFee;
	private String cashOnlyIndicator;
	private String suspendInd;
	private String autoPayEnabled;
	private Double billCycleCode;
	
	
	private CreditDetailsModel creditDetails;
   	
}
