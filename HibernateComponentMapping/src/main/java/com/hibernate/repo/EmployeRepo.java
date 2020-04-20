package com.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hibernate.entity.Employe;

@Repository
public interface EmployeRepo extends JpaRepository<Employe,Integer>{

}
