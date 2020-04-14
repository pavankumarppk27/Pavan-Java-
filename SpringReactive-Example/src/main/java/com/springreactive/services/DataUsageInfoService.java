package com.springreactive.services;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.entity.DataUsageInfoEntity;
import com.springreactive.model.DataUsageInfoModel;
import com.springreactive.repositories.DataUsageInfoRepository;
import reactor.core.publisher.Mono;

@Service
public class DataUsageInfoService {
	
	@Autowired
	private DataUsageInfoRepository dataUsageInfoRepository;
	
	
	public DataUsageInfoModel getDataUsageInfoDtlsById(Integer id){
		
		DataUsageInfoModel dataUsageInfoModel=new DataUsageInfoModel();
		DataUsageInfoEntity dataUsageInfoEntity=new DataUsageInfoEntity();
		Optional<DataUsageInfoEntity> optionalDataUsageInfoEntity = dataUsageInfoRepository.findById(id);
		
		if(optionalDataUsageInfoEntity.isPresent()) {
			dataUsageInfoEntity=optionalDataUsageInfoEntity.get();
			BeanUtils.copyProperties(dataUsageInfoEntity, dataUsageInfoModel);

		}		
			return dataUsageInfoModel;	
			}

}
