package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Data;

@Entity
@Data
@IdClass(CustomerId.class)
public class Customer {
	
	@Id
	@Column
	private Integer id;
	
	@Id
	@Column
	private String email;
	
	@Column
	private String customerName;

}
