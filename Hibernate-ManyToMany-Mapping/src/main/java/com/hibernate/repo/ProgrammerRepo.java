package com.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.entity.Programmer;

@Repository
public interface ProgrammerRepo extends JpaRepository<Programmer,Integer>{

}
