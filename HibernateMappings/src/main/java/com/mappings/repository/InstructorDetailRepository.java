package com.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mappings.entity.InstructorDetailEntity;

@Repository
public interface InstructorDetailRepository extends JpaRepository<InstructorDetailEntity,Integer>{

}
