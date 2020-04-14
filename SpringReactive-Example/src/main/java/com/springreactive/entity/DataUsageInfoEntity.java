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
public class DataUsageInfoEntity {

	@Id
	@SequenceGenerator(name = "seq7", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq7")
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
