package com.mappings.service;

import com.mappings.model.InstructorDetailModel;

public interface InstructorDetailService {

	public Integer registerInstructorDetails(InstructorDetailModel InstrDtlsModel);
	
	public String deleteBYId(Integer id);
}
