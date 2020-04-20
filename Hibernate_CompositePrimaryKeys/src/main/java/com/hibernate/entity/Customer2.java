package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Customer2 {
	
	
	@EmbeddedId
	private CustomerId2 customerId2;
	
	@Column
	private String customerName;

}
