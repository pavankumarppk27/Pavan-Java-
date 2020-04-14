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
public class BillAccountEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
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
	
	
	
	public BillAccountEntity() {
		// TODO Auto-generated constructor stub
	}



	public BillAccountEntity(String firstName, String accountNumber, String accountEstablishDate, String activeMtnCount,
			String billCycleNumber, Integer suspendedMtnCount, String singleBillCompanyCode, String oneBillStatusCode,
			String fraudIndicator, String emailId) {
		super();
		this.firstName = firstName;
		this.accountNumber = accountNumber;
		this.accountEstablishDate = accountEstablishDate;
		this.activeMtnCount = activeMtnCount;
		this.billCycleNumber = billCycleNumber;
		this.suspendedMtnCount = suspendedMtnCount;
		this.singleBillCompanyCode = singleBillCompanyCode;
		this.oneBillStatusCode = oneBillStatusCode;
		this.fraudIndicator = fraudIndicator;
		this.emailId = emailId;
	}
	
}
