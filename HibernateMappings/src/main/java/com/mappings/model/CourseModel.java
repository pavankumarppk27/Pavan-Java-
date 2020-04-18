package com.mappings.model;

import lombok.Data;

@Data
public class CourseModel {

	private Integer id;

	private String title;
	
	private InstructorModel instrModel;

}
