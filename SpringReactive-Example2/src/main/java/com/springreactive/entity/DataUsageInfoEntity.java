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
public class DataUsageInfoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String dataAllowanceBar;
	private String totalDataAllowances;
	private String carryOverAllowances;
	private String dataProductAllowanceBar;
	public DataUsageInfoEntity(String dataAllowanceBar, String totalDataAllowances, String carryOverAllowances,
			String dataProductAllowanceBar) {
		super();
		this.dataAllowanceBar = dataAllowanceBar;
		this.totalDataAllowances = totalDataAllowances;
		this.carryOverAllowances = carryOverAllowances;
		this.dataProductAllowanceBar = dataProductAllowanceBar;
	}
	
	public DataUsageInfoEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
}
