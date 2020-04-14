package com.springreactive.model;

import lombok.Data;

@Data
public class BillAccountModel {
	
	private String firstName;
	private String accountNumber;
	private String accountEstablishDate;
	private String activeMtnCount;
	private String billCycleNumber;
	private Integer suspendedMtnCount;
	private String singleBillCompanyCode;
	private String oneBillStatusCode;
	private String fraudIndicator;
	private String emailId;

	
	
}
