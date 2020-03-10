package com.springreactive;

public class WithDraw {
	
	
	private Long accNo;
	private String ifsc;
	private String branch;
	private String address;
	private double withDrawMoney;
	public Long getAccNo() {
		return accNo;
	}
	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getWithDrawMoney() {
		return withDrawMoney;
	}
	public void setWithDrawMoney(double withDrawMoney) {
		this.withDrawMoney = withDrawMoney;
	}
	@Override
	public String toString() {
		return "WithDraw [accNo=" + accNo + ", ifsc=" + ifsc + ", branch=" + branch + ", address=" + address
				+ ", withDrawMoney=" + withDrawMoney + "]";
	}
	public WithDraw(Long accNo, String ifsc, String branch, String address, double withDrawMoney) {
		super();
		this.accNo = accNo;
		this.ifsc = ifsc;
		this.branch = branch;
		this.address = address;
		this.withDrawMoney = withDrawMoney;
	}
	
	
	
	
	public WithDraw() {
		// TODO Auto-generated constructor stub
	}

}
