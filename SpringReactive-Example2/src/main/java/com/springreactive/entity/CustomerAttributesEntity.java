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
public class CustomerAttributesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String customerTypeCode;
	private String inWithVerizonInd;
	public CustomerAttributesEntity(String customerTypeCode, String inWithVerizonInd) {
		super();
		this.customerTypeCode = customerTypeCode;
		this.inWithVerizonInd = inWithVerizonInd;
	}
	
	
	public CustomerAttributesEntity() {
		// TODO Auto-generated constructor stub
	}
}
