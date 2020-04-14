package com.springreactive.main.model;

import com.springreactive.model.BillAccountModel;
import com.springreactive.model.CurrentProductListModel;
import com.springreactive.model.EventNotificationModel;

import lombok.Data;

@Data
public class AccountModel {

	
	
	private BillAccountModel billAccountModel;
	private CurrentProductListModel currentProductListModel;
	private EventNotificationModel eventNotificationModel;
	private PricingModel pricingModel;
	private MtnModel mtnModel;
	
}
