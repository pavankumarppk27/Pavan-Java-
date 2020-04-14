package com.springreactive.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.main.model.AccountModel;
import com.springreactive.main.model.CustomerModel;
import com.springreactive.model.CustomerAttributesModel;
import com.springreactive.model.EcpdProfileModel;
import com.springreactive.services.CustomerAttributesService;
import com.springreactive.services.EcpdProfileService;

import reactor.core.publisher.Mono;

@Service
public class CustomerDomainService {

	@Autowired
	private AccountDomainService accountDomainService;

	@Autowired
	private CustomerAttributesService customerAttributesModel;

	@Autowired
	private EcpdProfileService ecpdProfileService;

	public Mono<CustomerModel> getMonoCustomerDomainDtls(Integer id) {

		CustomerAttributesModel customerAttributesById = customerAttributesModel.getCustomerAttributesById(id);

		EcpdProfileModel ecpdProfileDtlsById = ecpdProfileService.getEcpdProfileDtlsById(id);

		AccountModel accountDomainDtls = accountDomainService.getAccountDomainDtls(id);

		CustomerModel customerModel = new CustomerModel();

		customerModel.setCustomerId(id.toString());
		customerModel.setCustomerAttributesModel(customerAttributesById);
		customerModel.setEcpdProfileModel(ecpdProfileDtlsById);
		customerModel.setAccountModel(accountDomainDtls);

		return Mono.just(customerModel);
	}

	public CustomerModel getCustomerDomainDtls(Integer id) {

		CustomerAttributesModel customerAttributesById = customerAttributesModel.getCustomerAttributesById(id);

		EcpdProfileModel ecpdProfileDtlsById = ecpdProfileService.getEcpdProfileDtlsById(id);

		AccountModel accountDomainDtls = accountDomainService.getAccountDomainDtls(id);

		CustomerModel customerModel = new CustomerModel();

		customerModel.setCustomerId(id.toString());
		customerModel.setCustomerAttributesModel(customerAttributesById);
		customerModel.setEcpdProfileModel(ecpdProfileDtlsById);
		customerModel.setAccountModel(accountDomainDtls);

		return customerModel;
	}

}
