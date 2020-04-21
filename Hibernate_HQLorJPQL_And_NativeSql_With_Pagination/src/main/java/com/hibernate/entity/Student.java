package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="std_id")
	private Integer id;
	
	@Column(name="std_name")
	private String name;

	@Column(name="std_subject")
	private String subject;

	@Column(name="std_percentage")
	private double percentage;

	public Student(String name, String subject, double percentage) {
		this.name = name;
		this.subject = subject;
		this.percentage = percentage;
	}

}
