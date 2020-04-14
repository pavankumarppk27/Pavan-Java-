package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.springboot.entity.CustomerEntity;
import com.springboot.model.CustomerModel;
import com.springboot.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public boolean saveCustomer(CustomerModel customerModel) {
		// TODO Auto-generated method stub
		CustomerEntity customerEntity = new CustomerEntity();
		BeanUtils.copyProperties(customerModel, customerEntity);
		CustomerEntity save = customerRepo.save(customerEntity);

		return save.getCustomerId() != null ? true : false;
	}

	@Override
	public List<CustomerModel> getCustomerDtls() {
		// TODO Auto-generated method stub

		List<CustomerEntity> getAllCustomerDtls = customerRepo.findAll();
		List<CustomerModel> customerDtls = new ArrayList<CustomerModel>();

		if (!getAllCustomerDtls.isEmpty() && getAllCustomerDtls.size() > 0)

			getAllCustomerDtls.forEach(customerEntity -> {

				CustomerModel customerModel = new CustomerModel();
				BeanUtils.copyProperties(customerEntity, customerModel);
				customerDtls.add(customerModel);

			});

		return customerDtls;
	}

	@Override
	public CustomerModel findByCustomerId(Integer customerId) {

		CustomerEntity customerEntity = customerRepo.findById(customerId).get();
		CustomerModel customerModel = new CustomerModel();
		BeanUtils.copyProperties(customerEntity, customerModel);

		return customerModel;
	}
	
	
	@Override
	public boolean deleteCustomerById(Integer customerId) {
		
	
		
		customerRepo.deleteById(customerId);
		
		return customerRepo.existsById(customerId)?true:false;
	}
	
	
	
	
	
	
}
