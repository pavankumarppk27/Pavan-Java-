package com.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.entity.Customer;
import com.hibernate.entity.CustomerId;

public interface CustomerRepo extends JpaRepository<Customer,CustomerId> {

}
