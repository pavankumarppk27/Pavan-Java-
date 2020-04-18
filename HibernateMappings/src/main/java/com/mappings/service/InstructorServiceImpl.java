package com.mappings.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mappings.entity.InstructorDetailEntity;
import com.mappings.entity.InstructorEntity;
import com.mappings.model.InstructorDetailModel;
import com.mappings.model.InstructorModel;
import com.mappings.repository.InstructorDetailRepository;
import com.mappings.repository.InstructorRepository;

@Service
public class InstructorServiceImpl implements InstructorService{

	@Autowired
	private InstructorDetailRepository instrDtlRepo;
	@Autowired
	private InstructorRepository instrRepo;
	
	@Override
	public Integer registerInstructorDetails(Integer id,InstructorModel InstrModel) {
		
		InstructorDetailEntity instructorDetailEntity = instrDtlRepo.findById(id).get();
		InstructorEntity instrEntity=new InstructorEntity();
		BeanUtils.copyProperties(InstrModel, instrEntity);
		instrEntity.setInstrDetail(instructorDetailEntity);
		
		//instrEntity.setCourses(Arrays.asList(new CourseEntity("Java"),new CourseEntity("Oracle")));
		
		return instrRepo.save(instrEntity).getId();
	}

	@Override
	public InstructorModel findBYId(Integer id) {
		InstructorModel instructorModel=new InstructorModel();
		InstructorEntity instructorEntity = instrRepo.findById(id).get();
		BeanUtils.copyProperties(instructorEntity,instructorModel );
		
		InstructorDetailEntity instrDtlEntity = instructorEntity.getInstrDetail();
		InstructorDetailModel instrDtlModel = new InstructorDetailModel();
		BeanUtils.copyProperties(instrDtlEntity,instrDtlModel );	
		instructorModel.setInstrDetail(instrDtlModel);
		
		return instructorModel;
	}

	@Override
	public String deleteBYId(Integer id) {
		
		instrRepo.deleteById(id);
		
		return instrRepo.existsById(id)?"not deleted":"deleted";
	}

}
