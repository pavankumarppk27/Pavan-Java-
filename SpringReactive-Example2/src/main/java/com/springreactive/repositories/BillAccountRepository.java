package com.springreactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactive.entity.BillAccountEntity;

@Repository
public interface BillAccountRepository extends JpaRepository<BillAccountEntity,Integer>{

}
