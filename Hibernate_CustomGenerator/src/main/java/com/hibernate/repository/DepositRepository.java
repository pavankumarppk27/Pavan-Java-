package com.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.entity.Deposit;

public interface DepositRepository extends JpaRepository<Deposit,Long>{

}
