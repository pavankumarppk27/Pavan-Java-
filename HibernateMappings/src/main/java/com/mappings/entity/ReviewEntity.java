package com.mappings.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Review_Tbl")
@Data
public class ReviewEntity {

	@Id
	@SequenceGenerator(name = "Review_Id", sequenceName = "Review_Id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "Review_Id")
	@Column(name = "Review_id")
	private Integer id;

	@Column
	private String comment;
	
	@Column(name="course_id")
	private Integer courseId;

}
