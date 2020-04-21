package com.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.entity.BankAccount;

public interface BankAccountRepo extends JpaRepository<BankAccount,Integer>{

}
