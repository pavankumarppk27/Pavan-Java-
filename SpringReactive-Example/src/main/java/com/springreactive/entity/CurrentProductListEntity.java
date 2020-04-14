package com.springreactive.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class CurrentProductListEntity {


	@Id
	@SequenceGenerator(name = "seq4", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq4")
	private Integer id;
	private String spoId;
	private String spoBillDesc;
	private String spoUniqueId;
	private String spoRuleGroupId;
	private String spoLevelCode;
	private String spoMethodCode;
	private String effectiveDate;
	private String endDate;
	private Double spoDefaultPrice;
	private Integer frequencyCount;
	private String frequencyCode;
	public CurrentProductListEntity(String spoId, String spoBillDesc, String spoUniqueId, String spoRuleGroupId,
			String spoLevelCode, String spoMethodCode, String effectiveDate, String endDate, Double spoDefaultPrice,
			Integer frequencyCount, String frequencyCode) {
		super();
		this.spoId = spoId;
		this.spoBillDesc = spoBillDesc;
		this.spoUniqueId = spoUniqueId;
		this.spoRuleGroupId = spoRuleGroupId;
		this.spoLevelCode = spoLevelCode;
		this.spoMethodCode = spoMethodCode;
		this.effectiveDate = effectiveDate;
		this.endDate = endDate;
		this.spoDefaultPrice = spoDefaultPrice;
		this.frequencyCount = frequencyCount;
		this.frequencyCode = frequencyCode;
	}
	
	
	
	
	
	public CurrentProductListEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
}
