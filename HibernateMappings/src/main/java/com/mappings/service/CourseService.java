package com.mappings.service;

import com.mappings.model.CourseModel;

public interface CourseService {

	public Integer registerCourseDtls(Integer id,CourseModel courseModel);
	
	public CourseModel courseById(Integer id);
}
