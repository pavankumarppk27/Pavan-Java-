package com.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Data
@Entity
@NoArgsConstructor
public class Deposit {
	
	
	@Column
	@Id
	@GenericGenerator(name="customer_Id",strategy = "com.hibernate.entity.CustomeGenerator")
	@GeneratedValue(generator ="customer_Id")
	private Long custId;
	
	@Column
	private String custName;
	
	@Column
	private Double depositMoney;
	
	@CreationTimestamp()
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updationDate;

	public Deposit(String custName, Double depositMoney) {
		super();
		this.custName = custName;
		this.depositMoney = depositMoney;
		
	}
	

	
	
}
