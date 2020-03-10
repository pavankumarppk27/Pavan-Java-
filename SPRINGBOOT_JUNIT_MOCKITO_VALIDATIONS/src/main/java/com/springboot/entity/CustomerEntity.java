package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_ENTITY")
public class CustomerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CUSTOMER_ID")
	private Integer customerId;
	
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	
	@Column(name="CUSTOMER_Email")
	private String customerEmail;
	
	@Column(name="CUSTOMER_SSN")
	private String customerSSN;
	
	@Column(name="CUSTOMER_MOBILE_NO")
	private Long customerMobileNum;
	
	@Column(name="CUSTOMER_ACCOUNT_NO")
	private Long customerAccountNo;
	
	@Column(name="CUSTOMER_ADDRESS")
	private String customerAddress;
	
	@Column(name="CUSTOMER_PIN")
	private Integer customerPIN;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerSSN() {
		return customerSSN;
	}
	public void setCustomerSSN(String customerSSN) {
		this.customerSSN = customerSSN;
	}
	public Long getCustomerMobileNum() {
		return customerMobileNum;
	}
	public void setCustomerMobileNum(Long customerMobileNum) {
		this.customerMobileNum = customerMobileNum;
	}
	public Long getCustomerAccountNo() {
		return customerAccountNo;
	}
	public void setCustomerAccountNo(Long customerAccountNo) {
		this.customerAccountNo = customerAccountNo;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Integer getCustomerPIN() {
		return customerPIN;
	}
	public void setCustomerPIN(Integer customerPIN) {
		this.customerPIN = customerPIN;
	}
	public CustomerEntity(Integer customerId, String customerName, String customerEmail, String customerSSN,
			Long customerMobileNum, Long customerAccountNo, String customerAddress, Integer customerPIN) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerSSN = customerSSN;
		this.customerMobileNum = customerMobileNum;
		this.customerAccountNo = customerAccountNo;
		this.customerAddress = customerAddress;
		this.customerPIN = customerPIN;
	}
	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerSSN=" + customerSSN + ", customerMobileNum=" + customerMobileNum
				+ ", customerAccountNo=" + customerAccountNo + ", customerAddress=" + customerAddress + ", customerPIN="
				+ customerPIN + "]";
	}
	
	
	
	
	public CustomerEntity(String customerName, String customerEmail, String customerSSN, Long customerMobileNum,
			Long customerAccountNo, String customerAddress, Integer customerPIN) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerSSN = customerSSN;
		this.customerMobileNum = customerMobileNum;
		this.customerAccountNo = customerAccountNo;
		this.customerAddress = customerAddress;
		this.customerPIN = customerPIN;
	}
	public CustomerEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
