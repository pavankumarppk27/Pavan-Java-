package com.springreactive.main.model;

import com.springreactive.model.MBillCompareModel;
import com.springreactive.model.PaymentInfoModel;

import lombok.Data;

@Data

public class PricingModel {

	
	private PaymentInfoModel paymentInfoModel;
	private MBillCompareModel mBillCompareModel;

	
}
