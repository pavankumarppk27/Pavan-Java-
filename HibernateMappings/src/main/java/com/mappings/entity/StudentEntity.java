package com.mappings.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Student_Tbl")
public class StudentEntity {
	
	@Id
	@SequenceGenerator(name = "Student_Id", sequenceName = "Student_Id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "Student_Id")
	@Column(name = "Student_id")
	private Integer id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;

	@Column
	private String email;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinTable(name = "Course_Student",
	           joinColumns=@JoinColumn(name="Student_id"),
	           inverseJoinColumns = @JoinColumn(name="Course_id")
			   )
	private List<CourseEntity> courseEntity;
	

}
