package com.springreactive.services;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.entity.DataAllowanceBarEntity;
import com.springreactive.model.DataAllowanceBarModel;
import com.springreactive.repositories.DataAllowanceBarRepository;

@Service
public class DataAllowanceBarService {

	@Autowired
	private DataAllowanceBarRepository dataAllowanceBarRepository;
	
	
	
	public DataAllowanceBarModel getDataAllowanceBarById(Integer id){
		
		DataAllowanceBarModel dataAllowanceBarModel=new DataAllowanceBarModel();
		Optional<DataAllowanceBarEntity> optionalDataAllowanceBarEntity = dataAllowanceBarRepository.findById(id);		
		DataAllowanceBarEntity dataAllowanceBarEntity=new DataAllowanceBarEntity();
		if(optionalDataAllowanceBarEntity.isPresent()) {
			dataAllowanceBarEntity=optionalDataAllowanceBarEntity.get();
		}	
		BeanUtils.copyProperties(dataAllowanceBarEntity, dataAllowanceBarModel);

			return dataAllowanceBarModel;	
			}
	
}
