package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

        Address address=new Address();
        
        address.setCity("Hyd");
        address.setDistrict("RangaDistr");
		address.setPincode(3333333);
		address.setState("TS");
		address.setVillage("AmeerPet");
		
		Address addr2=new Address();
		
        addr2.setCity("Gnt");
        addr2.setDistrict("RangaDistr");
		addr2.setPincode(3333333);
		addr2.setState("TS");
		addr2.setVillage("AmeerPet");
		
		List<Customer> customer=new ArrayList<Customer>();
				
		Customer cust =new Customer();
		
		cust.setCustomerId(1001);
		cust.setCustomerName("pavan");
		cust.setAddress(address);
		
		Customer cust2 =new Customer();
		
		cust2.setCustomerId(1002);
		cust2.setCustomerName("kumar");
		cust2.setAddress(addr2);
		
		customer.add(cust);
		customer.add(cust2);
		
		
		/*
		 * customer.get(0).setAddress(address); customer.get(0).setCustomerId(1001);
		 * customer.get(0).setCustomerName("pavan");
		 * 
		 * customer.get(1).setAddress(addr2); customer.get(1).setCustomerId(1002);
		 * customer.get(1).setCustomerName("kumar");
		 */
		
		Company company=new Company();
		
		company.setCompanyId(2001);
		company.setCompanyName("IVL GLOBAL");
		company.setCustomers(customer);
		
		Product product=new Product();
		product.setCompany(company);
		
		String city = product.getCompany().getCustomers().get(0).getAddress().getCity();		
		product.getCompany().getCustomers().get(1).getAddress().setCity("NRT");
		String city2 = product.getCompany().getCustomers().get(1).getAddress().getCity();
		
		System.out.println(city+"  "+city2);
		
		String s="pavan kuamr";
		
		String ss=s.indexOf('a')>0 ? s.substring(0, s.indexOf('a')):s;
		
		System.out.println(ss);
		
		
	}

}
