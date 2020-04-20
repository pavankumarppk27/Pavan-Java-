package com.hibernate.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Project {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name="project_id")
	private Integer id;
	
	@Column
	private String name;
	
	
	@ManyToMany(mappedBy ="project")
	
	private Set<Programmer> programmer;
	
}
