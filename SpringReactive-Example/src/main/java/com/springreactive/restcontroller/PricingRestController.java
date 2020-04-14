package com.springreactive.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springreactive.main.model.AccountModel;
import com.springreactive.main.model.CustomerModel;
import com.springreactive.main.model.MtnModel;
import com.springreactive.main.model.PricingModel;
import com.springreactive.main.services.AccountDomainService;
import com.springreactive.main.services.CustomerDomainService;
import com.springreactive.main.services.MtnDomainService;
import com.springreactive.main.services.PricingDomainService;

@RestController
public class PricingRestController {

	@Autowired
	private PricingDomainService pricingDomainService;
	
	@Autowired
	private MtnDomainService mtnDomainService;
	
	@Autowired
	private AccountDomainService accountDomainService;
	
	@Autowired
	private CustomerDomainService customerDomainService;
	
	@GetMapping("/getPricingInfo/id/{id}")
	public PricingModel getPricingDtls(@PathVariable("id") Integer id) {
		
		
		return pricingDomainService.getPricingDomainDtls(id);
	}
	
	@GetMapping("/getMtnInfo/id/{id}")
	public MtnModel getMtnDtls(@PathVariable("id") Integer id) {
		
		
		return mtnDomainService.getMtnDomainDtls(id);
	}
	
	@GetMapping("/getAccountInfo/id/{id}")
	public AccountModel getAccountDtls(@PathVariable("id") Integer id) {
		
		
		return accountDomainService.getAccountDomainDtls(id);
	}
	
	@GetMapping("/getCustomerInfo/id/{id}")
	public CustomerModel getCustomerDtls(@PathVariable("id") Integer id) {
		
		
		return customerDomainService.getCustomerDomainDtls(id);
	}
	
}
