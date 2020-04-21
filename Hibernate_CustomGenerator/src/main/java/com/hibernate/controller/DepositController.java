package com.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.entity.Deposit;
import com.hibernate.repository.DepositRepository;

@RestController
public class DepositController {

	@Autowired
	private DepositRepository depositRepo;
	
	@GetMapping("/saveDepositDtls")
	public String saveDepositDtls() {
		
		Deposit deposit=new Deposit("pavan",570000d);
		
		return "the custom generator id is:"+depositRepo.save(deposit).getCustId();
	}
	
	
}
