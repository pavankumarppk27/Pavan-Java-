package com.mappings.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="INSTRUCTOR_DETAIL_TBL")
@Entity
public class InstructorDetailEntity {
	
	@Id
	@SequenceGenerator(name="InstrDtl_Id",sequenceName = "InstrDtl_Id",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator ="InstrDtl_Id")
	@Column(name="instructor_detail_id")
	private Integer id;
	
	@Column(name="Youtube_Channel")
	private String youtubeChannel;
	
	@Column(name="hobby")
	private String hobby;
	
	@OneToOne(mappedBy = "instrDetail" , cascade = CascadeType.ALL)
	private InstructorEntity instr;
	
	
	public InstructorDetailEntity(){
		
	}


	public InstructorDetailEntity(Integer id, String youtubeChannel, String hobby) {
		super();
		this.id = id;
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}
	
	

}
