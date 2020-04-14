package com.springreactive.main.model;

import com.springreactive.model.BillCycleDataInfoModel;
import com.springreactive.model.DeviceInfoModel;
import com.springreactive.model.MtnDetailsModel;

import lombok.Data;

@Data
public class MtnModel {

	
	
	private MtnDetailsModel mtnDetails;
	private DeviceInfoModel deviceInfo;
	private BillCycleDataInfoModel billCycleDataInfo;
	

}
