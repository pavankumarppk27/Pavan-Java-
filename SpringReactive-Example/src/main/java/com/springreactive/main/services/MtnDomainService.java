package com.springreactive.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.main.model.MtnModel;
import com.springreactive.model.BillCycleDataInfoModel;
import com.springreactive.model.DataUsageInfoModel;
import com.springreactive.model.DeviceInfoModel;
import com.springreactive.model.MobileInfoModel;
import com.springreactive.model.MtnDetailsModel;
import com.springreactive.services.BillCycleDataService;
import com.springreactive.services.DataUsageInfoService;
import com.springreactive.services.DeviceInfoService;
import com.springreactive.services.MobileInfoService;
import com.springreactive.services.MtnDetailsService;

import reactor.core.publisher.Mono;

@Service
public class MtnDomainService {
	
	@Autowired
	private MtnDetailsService mtnDetailsService;
	
	@Autowired
	private DeviceInfoService deviceInfoService;
	
	@Autowired
	private BillCycleDataService billCycleDataService;
	
	@Autowired
	private MobileInfoService mobileInfoService;
	
	@Autowired
	private DataUsageInfoService dataUsageInfoService;
	
	
	public Mono<MtnModel> getMonoMtnDomainDtls(Integer id) {
		
		MtnDetailsModel mtnDetailsById = mtnDetailsService.getMtnDetailsById(id);		
		DeviceInfoModel deviceInfoDtlsById = deviceInfoService.getDeviceInfoDtlsById(id);		
		BillCycleDataInfoModel billCycleDataById = billCycleDataService.getBillCycleDataById(id);
		MobileInfoModel mobileInfoDtlsById = mobileInfoService.getMobileInfoDtlsById(id);	
		DataUsageInfoModel dataUsageInfoDtlsById = dataUsageInfoService.getDataUsageInfoDtlsById(id);
		
		if(mobileInfoDtlsById!=null)
		deviceInfoDtlsById.setMobileInfoModel(mobileInfoDtlsById);
		
		if(dataUsageInfoDtlsById!=null)
			mobileInfoDtlsById.setDataUsageInfoModel(dataUsageInfoDtlsById);
		
		MtnModel mtnModel=new MtnModel();
		
		if(mtnDetailsById!=null && deviceInfoDtlsById!=null && billCycleDataById!=null)
		
		mtnModel.setMtnDetails(mtnDetailsById);
		mtnModel.setBillCycleDataInfo(billCycleDataById);
		mtnModel.setDeviceInfo(deviceInfoDtlsById);
		
		
		return Mono.just(mtnModel);
	}
	
	
	
	
public MtnModel getMtnDomainDtls(Integer id) {
		
		MtnDetailsModel mtnDetailsById = mtnDetailsService.getMtnDetailsById(id);		
		DeviceInfoModel deviceInfoDtlsById = deviceInfoService.getDeviceInfoDtlsById(id);		
		BillCycleDataInfoModel billCycleDataById = billCycleDataService.getBillCycleDataById(id);
		MobileInfoModel mobileInfoDtlsById = mobileInfoService.getMobileInfoDtlsById(id);	
		DataUsageInfoModel dataUsageInfoDtlsById = dataUsageInfoService.getDataUsageInfoDtlsById(id);
		
		if(mobileInfoDtlsById!=null)
		deviceInfoDtlsById.setMobileInfoModel(mobileInfoDtlsById);
		
		if(dataUsageInfoDtlsById!=null)
			mobileInfoDtlsById.setDataUsageInfoModel(dataUsageInfoDtlsById);
		
		MtnModel mtnModel=new MtnModel();
		
		if(mtnDetailsById!=null && deviceInfoDtlsById!=null && billCycleDataById!=null)
		
		mtnModel.setMtnDetails(mtnDetailsById);
		mtnModel.setBillCycleDataInfo(billCycleDataById);
		mtnModel.setDeviceInfo(deviceInfoDtlsById);
		
		
		return mtnModel;
	}

	
}
