package com.springreactive.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.springreactive.model.MtnDetailsModel;

import lombok.Data;

@Data
@Table
@Entity
public class MtnDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer id;
	@Column
	private String mtnStatusCode;
	@Column
	private String mtnStatusReasonCode;
	@Column
	private String handsetEligibilityDate;
	@Column
	private Double numberOfInstallmentsToBill;
	@Column
	private String shareCardInfo;
	@Column
	private String  mmgResults;
	
	
	public MtnDetailsEntity(String mtnStatusCode, String mtnStatusReasonCode, String handsetEligibilityDate,
			Double numberOfInstallmentsToBill, String shareCardInfo, String mmgResults) {
		super();
		this.mtnStatusCode = mtnStatusCode;
		this.mtnStatusReasonCode = mtnStatusReasonCode;
		this.handsetEligibilityDate = handsetEligibilityDate;
		this.numberOfInstallmentsToBill = numberOfInstallmentsToBill;
		this.shareCardInfo = shareCardInfo;
		this.mmgResults = mmgResults;
	}
	
	
	public MtnDetailsEntity() {
		// TODO Auto-generated constructor stub
	}
	
}
