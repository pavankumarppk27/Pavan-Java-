package com.mappings.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mappings.entity.CourseEntity;
import com.mappings.entity.InstructorDetailEntity;
import com.mappings.entity.InstructorEntity;
import com.mappings.model.CourseModel;
import com.mappings.model.InstructorDetailModel;
import com.mappings.model.InstructorModel;
import com.mappings.repository.CourseRepository;
import com.mappings.repository.InstructorRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private InstructorRepository instrRepository;

	@Override
	public Integer registerCourseDtls(Integer id, CourseModel courseModel) {

		CourseEntity courseEntity = new CourseEntity();
		BeanUtils.copyProperties(courseModel, courseEntity);
		InstructorEntity instructorEntity = instrRepository.findById(id).get();
		courseEntity.setInstrEntity(instructorEntity);

		return courseRepository.save(courseEntity).getId();
	}

	@Override
	public CourseModel courseById(Integer id) {

		CourseModel courseModel = new CourseModel();
		InstructorModel instrModel = new InstructorModel();
		InstructorDetailModel instrDtlModel = new InstructorDetailModel();

		CourseEntity courseEntity = courseRepository.findById(id).get();
		InstructorEntity instrEntity = courseEntity.getInstrEntity();
		InstructorDetailEntity instrDtlEntity = instrEntity.getInstrDetail();

		BeanUtils.copyProperties(courseEntity, courseModel);
		BeanUtils.copyProperties(instrEntity, instrModel);
		BeanUtils.copyProperties(instrDtlEntity, instrDtlModel);
		
		instrModel.setInstrDetail(instrDtlModel);
		courseModel.setInstrModel(instrModel);
		
		return courseModel;
	}

}
