package com.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.entity.ImageEntity;

public interface ImageRepository extends JpaRepository<ImageEntity,Integer>{

}
