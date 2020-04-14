package com.springreactive.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.entity.CreditDetailsEntity;
import com.springreactive.model.CreditDetailsModel;
import com.springreactive.repositories.CreditDetailsRepository;

@Service
public class CreditDetailsService {
	
	@Autowired
	private CreditDetailsRepository creditDetailsRepository;
	
	public CreditDetailsModel getCreditDetailsById(Integer id){
		
		CreditDetailsEntity creditDetailsEntity = creditDetailsRepository.findById(id).get();	
		CreditDetailsModel creditDetailsModel=new CreditDetailsModel();	
		BeanUtils.copyProperties(creditDetailsEntity, creditDetailsModel);
		
		return creditDetailsModel;
	}

}
