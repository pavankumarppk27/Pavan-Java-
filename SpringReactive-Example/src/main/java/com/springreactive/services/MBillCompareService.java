package com.springreactive.services;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.entity.MBillCompareEntity;
import com.springreactive.model.MBillCompareModel;
import com.springreactive.repositories.MBillCompareRepository;

import reactor.core.publisher.Mono;

@Service
public class MBillCompareService {
	@Autowired
	private MBillCompareRepository mBillCompareRepository;
	
	
	public MBillCompareModel getMBillCompareDtlsById(Integer id) {
		
		Optional<MBillCompareEntity> optionalMBillCompareEntity = mBillCompareRepository.findById(id);
		MBillCompareEntity mBillCompareEntity=new MBillCompareEntity();
		MBillCompareModel mBillCompareModel=new MBillCompareModel();
		if(optionalMBillCompareEntity.isPresent()) 	
			mBillCompareEntity=optionalMBillCompareEntity.get();
		BeanUtils.copyProperties(mBillCompareEntity, mBillCompareModel);

		
	
		return mBillCompareModel;
	}

}
