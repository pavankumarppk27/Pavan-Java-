package com.springreactive.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.entity.BillCycleDataInfoEntity;
import com.springreactive.model.BillCycleDataInfoModel;
import com.springreactive.repositories.BillCycleDataInfoRepository;
@Service
public class BillCycleDataService {
	
	@Autowired
	private BillCycleDataInfoRepository billCycleDataInfoRepository;
	
	
	public BillCycleDataInfoModel getBillCycleDataById(Integer id) {
		
		BillCycleDataInfoEntity billCycleDataInfoEntity = billCycleDataInfoRepository.findById(id).get();
		BillCycleDataInfoModel billCycleDataInfoModel=new BillCycleDataInfoModel();
		
		BeanUtils.copyProperties(billCycleDataInfoEntity!=null?billCycleDataInfoEntity:null, billCycleDataInfoModel);
		
		return billCycleDataInfoModel;
	}
	

}
