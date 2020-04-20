package com.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.entity.Customer2;
import com.hibernate.entity.CustomerId;

public interface CustomerRepo2 extends JpaRepository<Customer2,CustomerId> {

}
