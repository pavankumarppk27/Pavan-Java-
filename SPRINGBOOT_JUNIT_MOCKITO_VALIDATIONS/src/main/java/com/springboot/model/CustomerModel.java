package com.springboot.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerModel {
	
	@XmlElement
	private Integer customerId;
	@XmlElement
	private String customerName;
	@XmlElement
	private String customerEmail;
	@XmlElement
	private String customerSSN;
	@XmlElement
	private Long customerMobileNum;
	@XmlElement
	private Long customerAccountNo;
	@XmlElement
	private String customerAddress;
	@XmlElement
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
	public CustomerModel(Integer customerId, String customerName, String customerEmail, String customerSSN,
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
	
	
	
	
	public CustomerModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	


}
