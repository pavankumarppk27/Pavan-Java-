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
public class EcpdProfileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
