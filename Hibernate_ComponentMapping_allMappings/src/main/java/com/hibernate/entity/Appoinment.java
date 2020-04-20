package com.hibernate.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class Appoinment {
	
	@Id
	@Column(name="appointment_id")
	@SequenceGenerator(name = "apment_id", sequenceName = "apment_id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "apment_id")
	private Long id;
	
	@Column
	private Timestamp appointmentTime;
	
	@Column
	private boolean started;
	
	@Column
	private boolean ended;
	
	@Column
	private String reason;

	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;

	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
}
