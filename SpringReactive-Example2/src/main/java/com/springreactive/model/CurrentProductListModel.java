package com.springreactive.model;


import lombok.Data;

@Data
public class CurrentProductListModel {
	
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
	

}
