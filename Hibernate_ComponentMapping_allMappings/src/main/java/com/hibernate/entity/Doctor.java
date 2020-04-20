package com.hibernate.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class Doctor {
	
	@Id
	@Column(name="doctor_id")
	@SequenceGenerator(name = "dctr_id", sequenceName = "dctr_id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "dctr_id")
	private Long id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String speciality;
	
	@ManyToMany(mappedBy = "doctors")
	private List<Patient> patients;
	
	
	@OneToMany
    private List<Appoinment> appointments;
	
}
