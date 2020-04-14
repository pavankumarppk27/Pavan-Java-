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
public class EcpdProfileEntity {

	@Id
	@SequenceGenerator(name = "seq9", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq9")
	private Integer id;
	private String customerTypeCode;
	private String inWithVerizonInd;
	public EcpdProfileEntity(String customerTypeCode, String inWithVerizonInd) {
		super();
		this.customerTypeCode = customerTypeCode;
		this.inWithVerizonInd = inWithVerizonInd;
	}
	
	
	
	public EcpdProfileEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
}
