package com.springreactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactive.entity.CustomerAttributesEntity;

@Repository
public interface CustomerAttributesRepository extends JpaRepository<CustomerAttributesEntity, Integer> {


}
