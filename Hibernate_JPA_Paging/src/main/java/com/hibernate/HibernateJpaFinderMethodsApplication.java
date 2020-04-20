package com.hibernate;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.entity.Product;
import com.hibernate.repository.ProductRepo;

@SpringBootApplication
public class HibernateJpaFinderMethodsApplication implements CommandLineRunner{
	
	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaFinderMethodsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Product> productList = Arrays.asList(
				      new Product("TV","FROM SAMSUNG COMPANY",30000D),
				      new Product("MOBILE","FROM APPLE COMPANY",20000d),
				      new Product("LAPTOP","FROM SONY COMPANY",40000d),
				      new Product("PEN","FROM FLAIR COMPANY",200d),
				      new Product("BIKE","FROM HONDA COMPANY",80000d),
				      new Product("SCOOTY","FROM ACTIVA COMPANY",50000d),
				      new Product("TABLET","FROM PARACETAMAL COMPANY",20d),
				      new Product("BIKE","FROM PULSAR COMPANY",100000d),			    
				      new Product("LAPTOP","FROM HP COMPANY",30000d),
				      new Product("HEADSET","FROM SAMSUNG COMPANY",2000d)
				);
		
		saveProductDtls(productList);	
	}

	
	public  void saveProductDtls(List<Product> productList) {
		
		 if(productRepo.findAll().size()<=5) {
			 productRepo.saveAll(productList);
		 }
	}
	
}
