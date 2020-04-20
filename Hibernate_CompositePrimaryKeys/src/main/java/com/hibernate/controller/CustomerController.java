package com.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.entity.Customer;
import com.hibernate.entity.Customer2;
import com.hibernate.entity.CustomerId2;
import com.hibernate.repository.CustomerRepo;
import com.hibernate.repository.CustomerRepo2;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepo custRepo;
	
	@Autowired
	private CustomerRepo2 custRepo2;
	
	@GetMapping("/saveCustomer")
	public String saveCustomer() {
			
		Customer entity = new Customer();
		entity.setId(1234);
		entity.setEmail("pavan@gmail.com");
		entity.setCustomerName("pavan");
		
		return custRepo.save(entity).getId()!=null?"saved":"notSaved";
	}
	
	@GetMapping("/saveCustomer2")
	public String saveCustomer2() {
			
		Customer2 entity = new Customer2();
		CustomerId2 customerId2=new CustomerId2();
		customerId2.setId(1234);
		customerId2.setEmail("pavan@gmail.com");
		entity.setCustomerName("pavan");
		entity.setCustomerId2(customerId2);
		
		return custRepo2.save(entity).getCustomerId2().getId()!=null?"saved":"not saved";
	}

}
