package com.springreactive.adapters;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;

import com.springreactive.main.model.AccountModel;
import com.springreactive.main.model.CustomerModel;
import com.springreactive.main.model.MtnModel;
import com.springreactive.main.model.PricingModel;
import com.springreactive.main.services.AccountDomainService;
import com.springreactive.main.services.CustomerDomainService;
import com.springreactive.main.services.MtnDomainService;
import com.springreactive.main.services.PricingDomainService;

import reactor.core.publisher.Mono;

public class CustomerInfoAdapterImpl {

	@Autowired
	private PricingDomainService pricingDomainService;
	
	@Autowired
	private MtnDomainService mtnDomainService;
	
	@Autowired
	private AccountDomainService accountDomainService;
	
	@Autowired
	private CustomerDomainService customerDomainService;
	
	public Mono<PricingModel> processData(Integer id) {
		
		Mono<PricingModel> pricingModelDtls = pricingDomainService.getMonoPricingDomainDtls(id)
		                    .filter(tester->tester.getMBillCompareModel()!=null)
		                    .map(value->{
		                    	
		                    	return value;
		                    })
		                    .timeout(Duration.ofMillis(7000))
		                    .onErrorResume(fallback->{
		                    	fallback.printStackTrace();
		                    	return Mono.just(new PricingModel());
		                    })
                            .	defaultIfEmpty(new PricingModel());
		
		
		Mono<MtnModel> mtnModelDtls = mtnDomainService.getMonoMtnDomainDtls(id)
		                .filter(tester->tester.getBillCycleDataInfo()!=null)
		                .map(value->{
		                	
		                	return value;
		                }).onErrorResume(fallback->{
		                	fallback.printStackTrace();
		                	
		                	return Mono.just(new MtnModel());
		                })
		                .defaultIfEmpty(new MtnModel());
		
		
		
		
		Mono<AccountModel> accountModelDtls = accountDomainService.getMonoAccountDomainDtls(id)
		                    .filter(tester->tester.getBillAccountModel()!=null)
		                    .map(value->{
		                    	
		                    	return value;
		                    }).onErrorResume(fallback->{
		                    	fallback.printStackTrace();
		                    	
		                    	return Mono.just(new AccountModel());
		                    }).defaultIfEmpty(new AccountModel());
		
		
		Mono<CustomerModel> customerModelDtls = customerDomainService.getMonoCustomerDomainDtls(id)
		                     .filter(tester->tester.getAccountModel()!=null)
		                     .map(value->{
		                    	 
		                    	 return value;
		                     }).onErrorResume(fallback->{
		                    	 fallback.printStackTrace();
		                    	 return Mono.just(new CustomerModel());
		                     })
		                     .defaultIfEmpty(new CustomerModel());
		
		
		
		Mono.zip(pricingModelDtls, mtnModelDtls, accountModelDtls,customerModelDtls).flatMap(transformer->{
			
			PricingModel pricingModel = transformer.getT1();
			MtnModel mtnModel = transformer.getT2();
			AccountModel accountModel = transformer.getT3();
			CustomerModel customerModel = transformer.getT4();
			
			return Mono.just("");
		});
		
		
		return Mono.just(new PricingModel());
	}
	
	
}
