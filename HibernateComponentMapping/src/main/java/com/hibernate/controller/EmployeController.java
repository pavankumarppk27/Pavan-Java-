package com.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hibernate.entity.Address;
import com.hibernate.entity.Employe;
import com.hibernate.repo.EmployeRepo;

@RestController
public class EmployeController {

	@Autowired
	private EmployeRepo repo;
	
	@GetMapping("/saveEmploye")
	public String saveEmploye() {
		
		Employe emp=new Employe(1,"pavan",25,new Address("x-road","nrt","gnt"));
		Employe save = repo.save(emp);
		
		return save.getId()!=null?"saved":"not saved";
	}
	
	
}
