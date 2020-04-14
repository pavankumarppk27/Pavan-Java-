package com.springreactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactive.entity.DeviceInfoEntity;

@Repository
public interface DeviceInfoRepository extends JpaRepository<DeviceInfoEntity, Integer> {


}
