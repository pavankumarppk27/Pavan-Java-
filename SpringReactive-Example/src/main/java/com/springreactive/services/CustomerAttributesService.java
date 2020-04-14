package com.springreactive.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.entity.CustomerAttributesEntity;
import com.springreactive.model.CustomerAttributesModel;
import com.springreactive.repositories.CustomerAttributesRepository;

import reactor.core.publisher.Mono;

@Service
public class CustomerAttributesService {

	@Autowired
	private CustomerAttributesRepository customerAttributesRepository;
	
	
	
	public CustomerAttributesModel getCustomerAttributesById(Integer id){
		
		CustomerAttributesEntity customerAttributesEntity = customerAttributesRepository.findById(id).get();
		CustomerAttributesModel customerAttributesModel=new CustomerAttributesModel();
		BeanUtils.copyProperties(customerAttributesEntity, customerAttributesModel);
		
		return customerAttributesModel;	
		}
	
	
}
