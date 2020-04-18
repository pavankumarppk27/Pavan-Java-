package com.mappings.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Course_Tbl")
public class CourseEntity {

	@Id
	@SequenceGenerator(name = "Course_Id", sequenceName = "Course_Id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "Course_Id")
	@Column(name = "Course_id")
	private Integer id;

	@Column
	private String title;

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name = "instr_id")
	private InstructorEntity instrEntity;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private List<ReviewEntity> reviews;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinTable(name = "Course_Student",
	           joinColumns=@JoinColumn(name="Course_id"),
	           inverseJoinColumns = @JoinColumn(name="Student_id")
			   )

	private List<StudentEntity> studentEntity;

	public CourseEntity(String title) {
		super();
		this.title = title;
	}

	public CourseEntity() {

	}
}
