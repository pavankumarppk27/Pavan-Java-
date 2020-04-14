package com.springreactive.services;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.entity.MobileInfoEntity;
import com.springreactive.model.MobileInfoModel;
import com.springreactive.repositories.MobileInfoRepository;

import reactor.core.publisher.Mono;

@Service
public class MobileInfoService {

	@Autowired
	private MobileInfoRepository mobileInfoRepository;
	
	public MobileInfoModel getMobileInfoDtlsById(Integer id) {
		
		Optional<MobileInfoEntity> optionalMobileInfoEntity = mobileInfoRepository.findById(id);
		MobileInfoEntity mobileInfoEntity=new MobileInfoEntity();
		MobileInfoModel mobileInfoModel=new MobileInfoModel();
		
		if(optionalMobileInfoEntity.isPresent()) 	
			mobileInfoEntity=optionalMobileInfoEntity.get();
		BeanUtils.copyProperties(mobileInfoEntity, mobileInfoModel);

		return mobileInfoModel;
	}
	
}
