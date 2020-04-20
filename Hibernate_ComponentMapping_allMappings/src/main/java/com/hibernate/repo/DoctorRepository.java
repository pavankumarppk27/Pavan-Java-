package com.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long>{

}
