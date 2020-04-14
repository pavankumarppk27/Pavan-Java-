package com.springreactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactive.entity.BillCycleDataInfoEntity;
@Repository
public interface BillCycleDataInfoRepository extends JpaRepository<BillCycleDataInfoEntity,Integer>{

}
