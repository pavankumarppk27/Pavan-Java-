package com.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{

}
