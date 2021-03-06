package com.springreactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactive.entity.DataAllowanceBarEntity;

@Repository
public interface DataAllowanceBarRepository extends JpaRepository<DataAllowanceBarEntity, Integer> {


}
