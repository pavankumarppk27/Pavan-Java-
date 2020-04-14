package com.springreactive.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.main.model.PricingModel;
import com.springreactive.model.CreditDetailsModel;
import com.springreactive.model.DataAllowanceBarModel;
import com.springreactive.model.MBillCompareModel;
import com.springreactive.model.PaymentInfoModel;
import com.springreactive.services.CreditDetailsService;
import com.springreactive.services.DataAllowanceBarService;
import com.springreactive.services.MBillCompareService;
import com.springreactive.services.PaymentInfoService;

import reactor.core.publisher.Mono;

@Service
public class PricingDomainService {

	@Autowired
	private MBillCompareService mBillCompareService;
	
	@Autowired
	private DataAllowanceBarService dataAllowanceBarService;
	
	@Autowired
	private CreditDetailsService creditDetailsService;
	
	@Autowired
	private PaymentInfoService paymentInfoService;
	
	
	
	
	public Mono<PricingModel> getMonoPricingDomainDtls(Integer id) {
		
		MBillCompareModel mBillCompareDtlsById = mBillCompareService.getMBillCompareDtlsById(id);
		
		DataAllowanceBarModel dataAllowanceBarById = dataAllowanceBarService.getDataAllowanceBarById(id);
		
		CreditDetailsModel creditDetailsById = creditDetailsService.getCreditDetailsById(id);
		
		PaymentInfoModel paymentInfoDtlsById = paymentInfoService.getPaymentInfoDtlsById(id);
		
		PricingModel pricingModel=new PricingModel();
			
		if(mBillCompareDtlsById!=null && dataAllowanceBarById!=null && creditDetailsById!=null && paymentInfoDtlsById!=null) {
		
			creditDetailsById.setDataAllowanceBarModel(dataAllowanceBarById);	
			paymentInfoDtlsById.setCreditDetails(creditDetailsById);
		
			pricingModel.setPaymentInfoModel(paymentInfoDtlsById);
			pricingModel.setMBillCompareModel(mBillCompareDtlsById);
						
	}
	
	 return Mono.just(pricingModel);
	}	
	
	
	
public PricingModel getPricingDomainDtls(Integer id) {
		
		MBillCompareModel mBillCompareDtlsById = mBillCompareService.getMBillCompareDtlsById(id);
		
		DataAllowanceBarModel dataAllowanceBarById = dataAllowanceBarService.getDataAllowanceBarById(id);
		
		CreditDetailsModel creditDetailsById = creditDetailsService.getCreditDetailsById(id);
		
		PaymentInfoModel paymentInfoDtlsById = paymentInfoService.getPaymentInfoDtlsById(id);
		
		PricingModel pricingModel=new PricingModel();
			
		if(mBillCompareDtlsById!=null && dataAllowanceBarById!=null && creditDetailsById!=null && paymentInfoDtlsById!=null) {
		
			creditDetailsById.setDataAllowanceBarModel(dataAllowanceBarById);	
			paymentInfoDtlsById.setCreditDetails(creditDetailsById);
		
			pricingModel.setPaymentInfoModel(paymentInfoDtlsById);
			pricingModel.setMBillCompareModel(mBillCompareDtlsById);
						
	}
	
	 return pricingModel;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}
