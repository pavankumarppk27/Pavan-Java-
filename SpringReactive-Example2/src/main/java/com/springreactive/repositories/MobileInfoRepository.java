package com.springreactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactive.entity.MobileInfoEntity;

@Repository
public interface MobileInfoRepository extends JpaRepository<MobileInfoEntity, Integer> {


}
