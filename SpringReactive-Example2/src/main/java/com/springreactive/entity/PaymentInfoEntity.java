package com.springreactive.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class PaymentInfoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer id;
	
	@Column
	private String lastPaymentDate;
	@Column
	private String pastDueBalance;
	@Column
	private String eCustomerDate;
	@Column
	private String invoiceDate;
	@Column
	private Double outStandingBalance;
	@Column
	private Double billTotalRemitAmount;
	@Column
	private Double lastPaymentAmount;
	@Column
	private Double lateFee;
	@Column
	private String cashOnlyIndicator;
	@Column
	private String suspendInd;
	@Column
	private String autoPayEnabled;
	@Column
	private Double billCycleCode;
	public PaymentInfoEntity(String lastPaymentDate, String pastDueBalance, String eCustomerDate, String invoiceDate,
			Double outStandingBalance, Double billTotalRemitAmount, Double lastPaymentAmount, Double lateFee,
			String cashOnlyIndicator, String suspendInd, String autoPayEnabled, Double billCycleCode) {
		super();
		this.lastPaymentDate = lastPaymentDate;
		this.pastDueBalance = pastDueBalance;
		this.eCustomerDate = eCustomerDate;
		this.invoiceDate = invoiceDate;
		this.outStandingBalance = outStandingBalance;
		this.billTotalRemitAmount = billTotalRemitAmount;
		this.lastPaymentAmount = lastPaymentAmount;
		this.lateFee = lateFee;
		this.cashOnlyIndicator = cashOnlyIndicator;
		this.suspendInd = suspendInd;
		this.autoPayEnabled = autoPayEnabled;
		this.billCycleCode = billCycleCode;
	}
	
	
	
	
	public PaymentInfoEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
}
