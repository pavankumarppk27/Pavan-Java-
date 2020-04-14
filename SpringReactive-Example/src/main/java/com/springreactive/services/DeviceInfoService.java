package com.springreactive.services;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.entity.DeviceInfoEntity;
import com.springreactive.model.DeviceInfoModel;
import com.springreactive.repositories.DeviceInfoRepository;

import reactor.core.publisher.Mono;

@Service
public class DeviceInfoService {

	
	
	@Autowired
private DeviceInfoRepository deviceInfoRepository;	
	
	
	
	public DeviceInfoModel getDeviceInfoDtlsById(Integer id) {

		Optional<DeviceInfoEntity> optionalDeviceInfoEntity = deviceInfoRepository.findById(id);
		DeviceInfoModel deviceInfoModel=new DeviceInfoModel();
		DeviceInfoEntity deviceInfoEntity=new DeviceInfoEntity();
		if(optionalDeviceInfoEntity.isPresent()) {
			deviceInfoEntity=optionalDeviceInfoEntity.get();
			BeanUtils.copyProperties(deviceInfoEntity, deviceInfoModel);

		}
	
		return deviceInfoModel;
	}
	

	
}
