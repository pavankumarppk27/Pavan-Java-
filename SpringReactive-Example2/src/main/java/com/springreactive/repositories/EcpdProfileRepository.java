package com.springreactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactive.entity.EcpdProfileEntity;

@Repository
public interface EcpdProfileRepository extends JpaRepository<EcpdProfileEntity, Integer> {


}
