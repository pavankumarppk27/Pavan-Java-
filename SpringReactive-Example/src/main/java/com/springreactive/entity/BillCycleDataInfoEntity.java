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
public class BillCycleDataInfoEntity {
	@Id
	@SequenceGenerator(name = "seq2", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq2")
	private Integer id;
	private String billCycleEndDate;
	private String billCycleResetDate;
	public BillCycleDataInfoEntity(String billCycleEndDate, String billCycleResetDate) {
		super();
		this.billCycleEndDate = billCycleEndDate;
		this.billCycleResetDate = billCycleResetDate;
	}

	
	
	public BillCycleDataInfoEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
}
