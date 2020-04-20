package com.hibernate.controller;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.entity.Appoinment;
import com.hibernate.entity.Doctor;
import com.hibernate.entity.Insurance;
import com.hibernate.entity.Patient;
import com.hibernate.repo.AppointmentRepository;
import com.hibernate.repo.DoctorRepository;
import com.hibernate.repo.PatientRepository;

@RestController
public class PatientSchedulingController {

	@Autowired
	private PatientRepository patientRepo;
	
	@Autowired
	private DoctorRepository doctorRepo;
	
	@Autowired
	private AppointmentRepository appoinmentRepo;
	
	@GetMapping("/saveDoctor")
	public String createDoctor() {
		
		Doctor doctor=new Doctor();
		doctor.setFirstName("pavan kumar");
		doctor.setLastName("paladugu");
		doctor.setSpeciality("ALL");
		//doctor.setAppointments(appoinmentRepo.findAll());
		
		return doctorRepo.save(doctor).getId()!=null?"inserted":"not inserted";
	}
	
	@GetMapping("/savePatient")
	public String createPatient() {
		
		Patient patient=new Patient();
		
		patient.setFirstName("ram");
		patient.setLastName("remo");
		patient.setPhone("9999999999");
		
		Insurance insurance=new Insurance();
		
		insurance.setProviderName("Blue Cross");
		insurance.setCopay(50d);
		
		patient.setInsurance(insurance);
		
		List<Doctor> doctorList = doctorRepo.findAll();
		
		patient.setDoctors(doctorList);
		
		
		return patientRepo.save(patient).getId()!=null?"inserted":"not inserted";
	}
	
	@GetMapping("/saveAppoinment")
	public String createAppoinment() {
		
		Appoinment appoinment=new Appoinment();
		
		Timestamp appoinmentTime=new Timestamp(new Date().getTime());
		appoinment.setAppointmentTime(appoinmentTime);
		appoinment.setReason("He has some problem");
		appoinment.setStarted(true);
		
		appoinment.setDoctor(doctorRepo.findById(1l).get());
		appoinment.setPatient(patientRepo.findById(1l).get());
		
		return appoinmentRepo.save(appoinment).getId()!=null?"inserted":"not inserted";
	}
	
}
