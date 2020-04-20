package com.hibernate.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class Patient {

	@Id
	@Column(name="patient_id")
	@SequenceGenerator(name = "ptnt_id", sequenceName = "ptnt_id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "ptnt_id")
	private Long id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String phone;
	
	@Embedded
	private Insurance insurance;

	/*
	 * in the below @JoinTable annotation
	 * @JoinColumn(name="patient_id"-->this refers the name which is available in patient_doctor(common table in db
	 *             referencedColumnName-->this refers the name of the id which has mentioned in the patient table. )
	 */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="patient_doctor",
			   joinColumns = @JoinColumn(name = "patient_id"/* ,referencedColumnName ="id" */),
               inverseJoinColumns = @JoinColumn(name="doctor_id")
    		   )
	private List<Doctor> doctors;
    
    @OneToMany
    private List<Appoinment> appointments;
    
}


