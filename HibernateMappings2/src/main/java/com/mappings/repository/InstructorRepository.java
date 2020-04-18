package com.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mappings.entity.InstructorEntity;

@Repository
public interface InstructorRepository extends JpaRepository<InstructorEntity,Integer>{

}
