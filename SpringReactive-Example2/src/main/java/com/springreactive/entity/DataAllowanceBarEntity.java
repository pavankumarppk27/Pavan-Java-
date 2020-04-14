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
public class DataAllowanceBarEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
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
	public DataAllowanceBarEntity(Double overAgeQty, String overAgeUnit, Double overageSize, String overageCost,
			String barColor, Double barPercent, Double totalUsed, Double totalAllowed, Double totalRemaining,
			String totalUnitOfMeasure, String allowanceType, String allowanceSource, String warningCode) {
		super();
		this.overAgeQty = overAgeQty;
		this.overAgeUnit = overAgeUnit;
		this.overageSize = overageSize;
		this.overageCost = overageCost;
		this.barColor = barColor;
		this.barPercent = barPercent;
		this.totalUsed = totalUsed;
		this.totalAllowed = totalAllowed;
		this.totalRemaining = totalRemaining;
		this.totalUnitOfMeasure = totalUnitOfMeasure;
		this.allowanceType = allowanceType;
		this.allowanceSource = allowanceSource;
		this.warningCode = warningCode;
	}
	
	
	public DataAllowanceBarEntity() {
		// TODO Auto-generated constructor stub
	}
	
}
