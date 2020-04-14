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
public class DeviceInfoEntity {

	@Id
	@SequenceGenerator(name = "seq8", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq8")
	private Integer id;
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
	public DeviceInfoEntity(String equipmentMfgName, String modelName, String divceType, String deviceId,
			String deviceTypeId, String deviceCategory, String deviceActivationDate, String deviceType4gSim,
			String deviceCategoryCode, String deviceCapabilityCode, String deviceNickName, String dualSimTrailEndDate) {
		super();
		this.equipmentMfgName = equipmentMfgName;
		this.modelName = modelName;
		this.divceType = divceType;
		this.deviceId = deviceId;
		this.deviceTypeId = deviceTypeId;
		this.deviceCategory = deviceCategory;
		this.deviceActivationDate = deviceActivationDate;
		this.deviceType4gSim = deviceType4gSim;
		this.deviceCategoryCode = deviceCategoryCode;
		this.deviceCapabilityCode = deviceCapabilityCode;
		this.deviceNickName = deviceNickName;
		this.dualSimTrailEndDate = dualSimTrailEndDate;
	}
	
	
	public DeviceInfoEntity() {
		// TODO Auto-generated constructor stub
	}
}
