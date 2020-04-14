package com.springreactive.model;

import lombok.Data;

@Data
public class MobileInfoModel {
	
	private String mtn;
	private String vzUpEnrolledDate;
	private String familyBaseEnrolledDate;
	private String globalOrderInfo;
		
	private DataUsageInfoModel dataUsageInfoModel;


}
