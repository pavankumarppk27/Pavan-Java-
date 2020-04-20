package com.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.entity.Appoinment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appoinment, Long> {

}
