package com.springreactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactive.entity.MtnDetailsEntity;


@Repository
public interface MtnDetailsRepository extends JpaRepository<MtnDetailsEntity, Integer> {


}
