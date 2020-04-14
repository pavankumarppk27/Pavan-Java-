package com.springreactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactive.entity.CreditDetailsEntity;
import com.springreactive.entity.CurrentProductListEntity;

@Repository
public interface CurrentProductListRepository extends JpaRepository<CurrentProductListEntity, Integer> {


}
