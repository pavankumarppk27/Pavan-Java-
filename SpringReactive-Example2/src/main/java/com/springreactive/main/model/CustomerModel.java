package com.springreactive.main.model;

import com.springreactive.model.CustomerAttributesModel;
import com.springreactive.model.EcpdProfileModel;

import lombok.Data;

@Data
public class CustomerModel {


	private String customerId;
	private CustomerAttributesModel customerAttributesModel;
	private EcpdProfileModel ecpdProfileModel;
	private AccountModel accountModel;

	
}
