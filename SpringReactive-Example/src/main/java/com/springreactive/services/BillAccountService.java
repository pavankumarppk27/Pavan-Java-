package com.springreactive.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.entity.BillAccountEntity;
import com.springreactive.model.BillAccountModel;
import com.springreactive.repositories.BillAccountRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BillAccountService {
	
	@Autowired
	private BillAccountRepository billAccountRepository;
	
	public Mono<List<BillAccountModel>> getAllBillAccountDtls() {
		
		List<BillAccountEntity> billAccountEntityList = billAccountRepository.findAll();			
		List<BillAccountModel> billAccountModelList=new ArrayList<BillAccountModel>();
		
		if(billAccountEntityList!=null && !billAccountEntityList.isEmpty())
		
			billAccountEntityList.forEach(billAccountEntity->{				
				//billAccountModel.setAccountEstablishDate(billAccountEntity.getAccountEstablishDate().trim().isEmpty()?null:billAccountEntity.getAccountEstablishDate());				
				BillAccountModel billAccountModel=new BillAccountModel();
				BeanUtils.copyProperties(billAccountEntity,billAccountModel);
				billAccountModelList.add(billAccountModel);			
			});
		
		Flux<BillAccountModel> fromIterable = Flux.fromIterable(billAccountModelList);
		
		return fromIterable.collectList();
	}
	
	public BillAccountModel getBillAccountDtlsById(Integer id) {
		
		BillAccountEntity billAccountEntity = billAccountRepository.findById(id).get();		
		BillAccountModel billAccountModel=new  BillAccountModel();	
		BeanUtils.copyProperties(billAccountEntity!=null ?billAccountEntity:null, billAccountModel);	
			
		return billAccountModel;
	}
	

}
