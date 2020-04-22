package com.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.entity.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer>{

}
