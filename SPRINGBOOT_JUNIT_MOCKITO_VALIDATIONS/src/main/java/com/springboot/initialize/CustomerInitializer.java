package com.springboot.initialize;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.entity.CustomerEntity;
import com.springboot.repository.CustomerRepository;

@Component
public class CustomerInitializer implements CommandLineRunner{

	
	@Autowired
	private CustomerRepository customerRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		initialDataSetUp();
	}
	
	
	public List<CustomerEntity> data(){
		
		List<CustomerEntity> custDtlsList = Arrays.asList(new CustomerEntity("Pavan","pavan@gmail.com","123-45-7894",9998888833L,3411789245L,"Hyderabad",554789),
				      new CustomerEntity("Pavan","pavan@gmail.com","323-45-7894",9977665533L,4498569245L,"Hyderabad",412789),
				      new CustomerEntity("Pavan","pavan@gmail.com","123-45-7894",9988997733L,7789529245L,"Hyderabad",678789));
		
		
		return custDtlsList;		
	}
	
	
	public void initialDataSetUp() {
		
		if(customerRepo.count()<1)
		customerRepo.saveAll(data());
		            
	}

}
