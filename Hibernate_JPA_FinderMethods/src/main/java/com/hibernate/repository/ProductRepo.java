package com.hibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{

	//===>Finder Methods Can return Class Type and List Type Data.
	
	//public List<Product> findByName(String name);
	  public Product findByName(String name);
	  public Product findByDescription(String name);
	  public Product findByNameAndDescription(String name,String description);
	  public List<Product> findByPriceGreaterThan(Double price);	  
	  public List<Product> findByDescriptionContains(String description);
	  public List<Product> findByPriceBetween(Double price,Double price2);
	  public List<Product> findByDescriptionLike(String description);
	  public List<Product> findByIdIn(List<Integer> ids);
}

