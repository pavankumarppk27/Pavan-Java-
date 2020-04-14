package com.springreactive.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.springreactive.model.MtnDetailsModel;

import lombok.Data;

@Data
@Table
@Entity
public class MobileInfoEntity {
	@Id
	@SequenceGenerator(name = "seq12", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq12")
	private Integer id;
	@Column
	private String mtn;
	@Column
	private String vzUpEnrolledDate;
	@Column
	private String familyBaseEnrolledDate;
	@Column
	private String globalOrderInfo;
	public MobileInfoEntity(String mtn, String vzUpEnrolledDate, String familyBaseEnrolledDate,
			String globalOrderInfo) {
		super();
		this.mtn = mtn;
		this.vzUpEnrolledDate = vzUpEnrolledDate;
		this.familyBaseEnrolledDate = familyBaseEnrolledDate;
		this.globalOrderInfo = globalOrderInfo;
	}
	
	
	
	
	public MobileInfoEntity() {
		// TODO Auto-generated constructor stub
	}
	
}
