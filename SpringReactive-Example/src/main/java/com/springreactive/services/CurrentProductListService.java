package com.springreactive.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.entity.CurrentProductListEntity;
import com.springreactive.model.CurrentProductListModel;
import com.springreactive.repositories.CurrentProductListRepository;
import reactor.core.publisher.Mono;

@Service
public class CurrentProductListService {

	@Autowired
	private CurrentProductListRepository currentProductListRepository;
	
	
	public CurrentProductListModel getCreditProductListDtlsById(Integer id){
		
		CurrentProductListEntity currentProductListEntity = currentProductListRepository.findById(id).get();
		CurrentProductListModel currentProductListModel=new CurrentProductListModel(); 
		BeanUtils.copyProperties(currentProductListEntity, currentProductListModel);
		
		return currentProductListModel;	
		}
	
	
}
