package com.hibernate.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hibernate.entity.Product;
import com.hibernate.repository.ProductRepo;

@RestController
public class ProductController {

	@Autowired
	private ProductRepo productRepo;

	@GetMapping("/findByListName")
	public List<Product> findByListName() {

		// return productRepo.findByName("LAPTOP");
		return null;
	}

	@GetMapping("/findByName")
	public Product findByName() {

		return productRepo.findByName("MOBILE");
	}

	@GetMapping("/findByDescription")
	public Product findByDescription(String name) {

		return productRepo.findByDescription("FROM FLAIR COMPANY");
	}

	// findByNameAndDescription

	@GetMapping("/findByNameAndDescription")
	public Product findByNameAndDescription(String name) {

		return productRepo.findByNameAndDescription("PEN", "FROM FLAIR COMPANY");
	}

	@GetMapping("/findByPriceGreaterThan")
	public List<Product> findByPriceGreaterThan(Double price) {

		return productRepo.findByPriceGreaterThan(50000d);
	}

	@GetMapping("/findByDescriptionContains")
	public List<Product> findByDescriptionContains(String description) {

		return productRepo.findByDescriptionContains("FROM");
	}

	@GetMapping("/findByPriceBetween")
	public List<Product> findByPriceBetween(Double price, Double price2) {

		return productRepo.findByPriceBetween(50000d, 100000d);
	}
	@GetMapping("/findByDescriptionLike")
	 public List<Product> findByDescriptionLike(String description){
		 
		 return productRepo.findByDescriptionLike("%SAMSUNG%");
	 }
	
	@GetMapping("/findByIdIn")
	 public List<Product> findByIdIn(String description){
		 
		 return productRepo.findByIdIn(Arrays.asList(1,3,4));
	 }
	

}
