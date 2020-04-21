package com.hibernate.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.entity.Product;
import com.hibernate.repository.ProductRepo;

@RestController
public class ProductController {

	@Autowired
	private ProductRepo productRepo;

	@GetMapping("/paging")
	public List<Product> findAllPaging(){
		
		Pageable pageable=PageRequest.of(1, 5);		
		Page<Product> pageableData = productRepo.findAll(pageable);
			
		return pageableData.hasContent()?pageableData.stream().collect(Collectors.toList()):new ArrayList<Product>();
	}
	
	//By default, records are ordered in DESCENDING order. To choose ASCENDING order, use .ascending() method.
	@GetMapping("/pagingAndSorting")
    public List<Product> findAllPaginAndSorting(){
    	
    	//Pageable pageable=PageRequest.of(0, 10, Sort.by("name"));
    	Pageable pageable=PageRequest.of(0, 10, Sort.by("name").ascending());
    	Page<Product>  pageableData= productRepo.findAll(pageable);
    	
    	return pageableData.hasContent()?pageableData.stream().collect(Collectors.toList()):new ArrayList<Product>();
    }
	
	@GetMapping("/sorting")
    public Iterable<Product> sorting(){
    	
    	Sort sort=Sort.by("price").descending();
    	Iterable<Product> sortingData = productRepo.findAll(sort);
    
    	return sortingData;    }
	
}
