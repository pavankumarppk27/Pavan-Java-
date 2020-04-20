package com.hibernate.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.entity.Programmer;
import com.hibernate.entity.Project;
import com.hibernate.repo.ProgrammerRepo;

@RestController
public class ProgrammerController {

	@Autowired
	private ProgrammerRepo proRepo;
	
	@GetMapping("/saveDtls")
	public String saveDtls() {
		
		Programmer programmer=new Programmer();
		programmer.setName("pavan kumar");
		programmer.setSal(42000);
		
		HashSet<Project> hash=new HashSet<>();
		Project project=new Project();
		project.setName("Aggregate");
		hash.add(project);
		Project project2=new Project();
		project2.setName("Domain");
		hash.add(project2);
		
		programmer.setProject(hash);
		
		return proRepo.save(programmer).getId()!=null?"Inserted":"Not Inserted";
	}
	
	
}
