package com.springreactive.services;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.entity.MtnDetailsEntity;
import com.springreactive.model.MtnDetailsModel;
import com.springreactive.repositories.MtnDetailsRepository;

import reactor.core.publisher.Mono;

@Service
public class MtnDetailsService {
	
	@Autowired
	private MtnDetailsRepository mtnDetailsRepository;
	
	public MtnDetailsModel getMtnDetailsById(Integer id) {
		
		Optional<MtnDetailsEntity> optionalMtnDetailsEntity = mtnDetailsRepository.findById(id);
		MtnDetailsEntity mtnDetailsEntity=new MtnDetailsEntity();
		MtnDetailsModel mtnDetailsModel=new MtnDetailsModel();
		if(optionalMtnDetailsEntity.isPresent()) {
			mtnDetailsEntity=optionalMtnDetailsEntity.get();
			BeanUtils.copyProperties(mtnDetailsEntity, mtnDetailsModel);
		}
		
		return mtnDetailsModel;
	}

}
