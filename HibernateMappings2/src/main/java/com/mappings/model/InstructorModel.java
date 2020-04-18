package com.mappings.model;

import lombok.Data;

@Data
public class InstructorModel {

	private Integer id;

	private String firstName;

	private String lastName;

	private String email;

	private InstructorDetailModel instrDetail;

	public InstructorModel(Integer id, String firstName, String lastName, String email,
			InstructorDetailModel instrDetail) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.instrDetail = instrDetail;
	}

	public InstructorModel() {
		
	}
	
}
