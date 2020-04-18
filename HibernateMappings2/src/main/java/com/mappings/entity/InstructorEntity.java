package com.mappings.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Table(name="INSTRUCTOR_TBL")
@Data
@Entity
public class InstructorEntity {

	@Id
	@SequenceGenerator(name = "Instr_Id", sequenceName = "Instr_Id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "Instr_Id")
	@Column(name = "instr_id")
	private Integer id;

	@Column
	private String firstName;

	@Column
	private String lastName;

	@Column
	private String email;

	// in the place of "name" we have to whatever we have given in
	// InstructorDetailEntity
	// on top of the id like this--->@Column(name="instructor_detail_id")

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_id")
	private InstructorDetailEntity instrDetail;

	public InstructorEntity() {

	}

	public InstructorEntity(Integer id, String firstName, String lastName, String email,
			InstructorDetailEntity instrDetail) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.instrDetail = instrDetail;
	}

}
