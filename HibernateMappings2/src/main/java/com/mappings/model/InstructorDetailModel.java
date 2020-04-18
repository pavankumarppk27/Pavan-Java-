package com.mappings.model;

import lombok.Data;

@Data
public class InstructorDetailModel {

	private Integer id;

	private String youtubeChannel;

	private String hobby;

	public InstructorDetailModel(Integer id, String youtubeChannel, String hobby) {
		super();
		this.id = id;
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}

	public InstructorDetailModel() {
		
	}
	
	
}
