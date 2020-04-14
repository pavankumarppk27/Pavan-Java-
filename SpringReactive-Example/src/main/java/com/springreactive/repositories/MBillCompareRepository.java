package com.springreactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactive.entity.MBillCompareEntity;

@Repository
public interface MBillCompareRepository extends JpaRepository<MBillCompareEntity, Integer> {


}
