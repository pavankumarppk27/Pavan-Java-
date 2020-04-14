package com.springreactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactive.entity.DataUsageInfoEntity;

@Repository
public interface DataUsageInfoRepository extends JpaRepository<DataUsageInfoEntity, Integer> {


}
