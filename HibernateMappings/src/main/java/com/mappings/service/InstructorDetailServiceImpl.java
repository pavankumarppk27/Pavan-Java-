package com.mappings.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mappings.entity.InstructorDetailEntity;
import com.mappings.model.InstructorDetailModel;
import com.mappings.repository.InstructorDetailRepository;

@Service
public class InstructorDetailServiceImpl implements InstructorDetailService{

	@Autowired
	private InstructorDetailRepository instrDtlsRepo;
	
	@Override
	public Integer registerInstructorDetails(InstructorDetailModel InstrDtlsModel) {

		InstructorDetailEntity instrDtlsEntity=new InstructorDetailEntity();
		BeanUtils.copyProperties(InstrDtlsModel, instrDtlsEntity);
				
		return instrDtlsRepo.save(instrDtlsEntity).getId();
	}

	@Override
	public String deleteBYId(Integer id) {

		
		InstructorDetailEntity instructorDetailEntity = instrDtlsRepo.findById(id).get();
		
		instrDtlsRepo.deleteById(id);
		
		

		return instrDtlsRepo.existsById(id)?"Not Deleted":"Deleted";
	}

	

}
