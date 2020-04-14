package com.springreactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactive.entity.CreditDetailsEntity;

@Repository
public interface CreditDetailsRepository extends JpaRepository<CreditDetailsEntity,Integer>{


}
