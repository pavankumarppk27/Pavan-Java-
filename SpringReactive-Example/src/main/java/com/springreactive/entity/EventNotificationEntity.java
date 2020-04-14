package com.springreactive.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class EventNotificationEntity {

	
	@Id
	@SequenceGenerator(name = "seq10", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq10")
	private Integer id;
	private String eventName;
	private String eventValue;
	public EventNotificationEntity(String eventName, String eventValue) {
		super();
		this.eventName = eventName;
		this.eventValue = eventValue;
	}
	
	
	
	public EventNotificationEntity() {
		// TODO Auto-generated constructor stub
	}
	
}
