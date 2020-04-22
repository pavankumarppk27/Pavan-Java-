package com.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.entity.FileEntity;

public interface FileRepository extends JpaRepository<FileEntity,Integer>{

}
