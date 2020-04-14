package com.springboot.service;

import java.util.List;

import com.springboot.model.CustomerModel;

public interface CustomerService {
	
	public boolean saveCustomer(CustomerModel customerModel);
	
	public List<CustomerModel> getCustomerDtls();
	
	public CustomerModel findByCustomerId(Integer customerId);
	
	public boolean deleteCustomerById(Integer customerId);
	

}
