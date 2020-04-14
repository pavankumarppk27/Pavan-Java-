package com.springreactive.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.main.model.AccountModel;
import com.springreactive.main.model.MtnModel;
import com.springreactive.main.model.PricingModel;
import com.springreactive.model.BillAccountModel;
import com.springreactive.model.CurrentProductListModel;
import com.springreactive.model.EventNotificationModel;
import com.springreactive.services.BillAccountService;
import com.springreactive.services.CurrentProductListService;
import com.springreactive.services.EventNotificationService;

import reactor.core.publisher.Mono;

@Service
public class AccountDomainService {
	
	@Autowired
	private BillAccountService billAccountService;
	
	@Autowired
	private CurrentProductListService currentProductListService;
	
	@Autowired
	private EventNotificationService eventNotificationService;

	@Autowired
	private PricingDomainService pricingDomainService;
	
	@Autowired
	private MtnDomainService mtnDetailsService;
	
	
	
	public Mono<AccountModel> getMonoAccountDomainDtls(Integer id) {
		
		BillAccountModel billAccountDtlsById = billAccountService.getBillAccountDtlsById(id);		
		CurrentProductListModel creditProductListDtlsById = currentProductListService.getCreditProductListDtlsById(id);		
		EventNotificationModel eventNotificationDtlsById = eventNotificationService.getEventNotificationDtlsById(id);		
		PricingModel pricingDomainDtls = pricingDomainService.getPricingDomainDtls(id);		
		MtnModel mtnDomainDtls = mtnDetailsService.getMtnDomainDtls(id);
		
		AccountModel accountModel=new AccountModel();
		
		accountModel.setBillAccountModel(billAccountDtlsById);
		accountModel.setCurrentProductListModel(creditProductListDtlsById);
		accountModel.setEventNotificationModel(eventNotificationDtlsById);
		accountModel.setPricingModel(pricingDomainDtls);
		accountModel.setMtnModel(mtnDomainDtls);
		
		return Mono.just(accountModel);
	}
	
public AccountModel getAccountDomainDtls(Integer id) {
		
		BillAccountModel billAccountDtlsById = billAccountService.getBillAccountDtlsById(id);		
		CurrentProductListModel creditProductListDtlsById = currentProductListService.getCreditProductListDtlsById(id);		
		EventNotificationModel eventNotificationDtlsById = eventNotificationService.getEventNotificationDtlsById(id);		
		PricingModel pricingDomainDtls = pricingDomainService.getPricingDomainDtls(id);		
		MtnModel mtnDomainDtls = mtnDetailsService.getMtnDomainDtls(id);
		
		AccountModel accountModel=new AccountModel();
		
		accountModel.setBillAccountModel(billAccountDtlsById);
		accountModel.setCurrentProductListModel(creditProductListDtlsById);
		accountModel.setEventNotificationModel(eventNotificationDtlsById);
		accountModel.setPricingModel(pricingDomainDtls);
		accountModel.setMtnModel(mtnDomainDtls);
		
		return accountModel;
	}
}
