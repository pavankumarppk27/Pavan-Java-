package com.springreactive.model;


import lombok.Data;

@Data
public class DataAllowanceBarModel {
	
	private Double overAgeQty;
	private String overAgeUnit;
	private Double overageSize;
	private String overageCost;
	private String barColor;
	private Double barPercent;
	private Double totalUsed;
	private Double totalAllowed;
	private Double totalRemaining;
	private String totalUnitOfMeasure;
	private String allowanceType;
	private String allowanceSource;
	private String warningCode;
	
	

}
