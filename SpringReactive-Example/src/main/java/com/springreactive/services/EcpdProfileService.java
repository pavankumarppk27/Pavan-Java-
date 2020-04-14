package com.springreactive.services;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.entity.EcpdProfileEntity;
import com.springreactive.model.EcpdProfileModel;
import com.springreactive.repositories.EcpdProfileRepository;

import reactor.core.publisher.Mono;

@Service
public class EcpdProfileService {

	@Autowired
	private EcpdProfileRepository ecpdProfileRepository;
	
	
	public EcpdProfileModel getEcpdProfileDtlsById(Integer id) {

		Optional<EcpdProfileEntity> optionalEcpdProfileEntity = ecpdProfileRepository.findById(id);
		EcpdProfileEntity ecpdProfileEntity=new EcpdProfileEntity();
		EcpdProfileModel ecpdProfileModel=new EcpdProfileModel();
		
		if(optionalEcpdProfileEntity.isPresent()) 	
			ecpdProfileEntity=optionalEcpdProfileEntity.get();
		BeanUtils.copyProperties(ecpdProfileEntity, ecpdProfileModel);
	
		return ecpdProfileModel;
	}
	
}
