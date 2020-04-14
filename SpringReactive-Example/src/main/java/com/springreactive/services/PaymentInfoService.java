package com.springreactive.services;

import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springreactive.entity.PaymentInfoEntity;
import com.springreactive.model.PaymentInfoModel;
import com.springreactive.repositories.PaymentInfoRepository;
import reactor.core.publisher.Mono;

@Service
public class PaymentInfoService {
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	public PaymentInfoModel getPaymentInfoDtlsById(Integer id) {

		Optional<PaymentInfoEntity> optionalPaymentInfoEntity = paymentInfoRepository.findById(id);
		PaymentInfoModel paymentInfoModel=new PaymentInfoModel();
		PaymentInfoEntity paymentInfoEntity=new PaymentInfoEntity();
		if(optionalPaymentInfoEntity.isPresent()) 	
			paymentInfoEntity=optionalPaymentInfoEntity.get();
		BeanUtils.copyProperties(paymentInfoEntity, paymentInfoModel);

		
	
		return paymentInfoModel;
	}
	

}
