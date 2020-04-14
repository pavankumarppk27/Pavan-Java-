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
public class MBillCompareEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
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
	
	public MBillCompareEntity(Double totalCharges, String invoicePeriod, Double currBalanceFwd,
			Double totalCurrOneTimeChg, Double totalCurrMonChg, Double totoalCurrTaxChg, String currentMonthDesc,
			String prevMonthDesc, Double totatalCurrentCharges, Double prevTotalCharges) {
		super();
		this.totalCharges = totalCharges;
		this.invoicePeriod = invoicePeriod;
		this.currBalanceFwd = currBalanceFwd;
		this.totalCurrOneTimeChg = totalCurrOneTimeChg;
		this.totalCurrMonChg = totalCurrMonChg;
		this.totoalCurrTaxChg = totoalCurrTaxChg;
		this.currentMonthDesc = currentMonthDesc;
		this.prevMonthDesc = prevMonthDesc;
		this.totatalCurrentCharges = totatalCurrentCharges;
		this.prevTotalCharges = prevTotalCharges;
	}
	
	
	public MBillCompareEntity() {
		// TODO Auto-generated constructor stub
	}
	
}
