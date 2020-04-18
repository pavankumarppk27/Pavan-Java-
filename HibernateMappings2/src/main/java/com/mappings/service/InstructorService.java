package com.mappings.service;

import com.mappings.model.InstructorModel;

public interface InstructorService {

	
	public Integer registerInstructorDetails(Integer id,InstructorModel InstrModel);

	public InstructorModel findBYId(Integer id);
	
	public String deleteBYId(Integer id);
	
}
