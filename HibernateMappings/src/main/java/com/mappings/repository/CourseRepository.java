package com.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mappings.entity.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity,Integer>{

}
