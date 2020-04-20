package com.hibernate.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity	
@Data
public class Programmer {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name="programmer_id")
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private Integer sal;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="programmer_project",
	           joinColumns=@JoinColumn(name="programmer_id"/*referencedColumnName = ""*/),
	           inverseJoinColumns = @JoinColumn(name="project_id"/*referencedColumnName = ""*/)
			  )
	private Set<Project> project;

}
