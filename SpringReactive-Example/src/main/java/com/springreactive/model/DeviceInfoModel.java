package com.springreactive.model;

import lombok.Data;

@Data
public class DeviceInfoModel {
	
	private String equipmentMfgName;
	private String modelName;
	private String divceType;
	private String deviceId;
	private String deviceTypeId;
	private String deviceCategory;
	private String deviceActivationDate;
	private String deviceType4gSim;
	private String deviceCategoryCode;
	private String deviceCapabilityCode;
	private String deviceNickName;
	private String dualSimTrailEndDate;
	
	private MobileInfoModel mobileInfoModel;
	
}
