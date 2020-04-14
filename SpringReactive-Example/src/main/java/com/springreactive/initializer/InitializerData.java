package com.springreactive.initializer;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springreactive.entity.BillAccountEntity;
import com.springreactive.entity.BillCycleDataInfoEntity;
import com.springreactive.entity.CreditDetailsEntity;
import com.springreactive.entity.CurrentProductListEntity;
import com.springreactive.entity.CustomerAttributesEntity;
import com.springreactive.entity.DataAllowanceBarEntity;
import com.springreactive.entity.DataUsageInfoEntity;
import com.springreactive.entity.DeviceInfoEntity;
import com.springreactive.entity.EcpdProfileEntity;
import com.springreactive.entity.EventNotificationEntity;
import com.springreactive.entity.MBillCompareEntity;
import com.springreactive.entity.MobileInfoEntity;
import com.springreactive.entity.MtnDetailsEntity;
import com.springreactive.entity.PaymentInfoEntity;
import com.springreactive.repositories.BillAccountRepository;
import com.springreactive.repositories.BillCycleDataInfoRepository;
import com.springreactive.repositories.CreditDetailsRepository;
import com.springreactive.repositories.CurrentProductListRepository;
import com.springreactive.repositories.CustomerAttributesRepository;
import com.springreactive.repositories.DataAllowanceBarRepository;
import com.springreactive.repositories.DataUsageInfoRepository;
import com.springreactive.repositories.DeviceInfoRepository;
import com.springreactive.repositories.EcpdProfileRepository;
import com.springreactive.repositories.EventNotificationRepository;
import com.springreactive.repositories.MBillCompareRepository;
import com.springreactive.repositories.MobileInfoRepository;
import com.springreactive.repositories.MtnDetailsRepository;
import com.springreactive.repositories.PaymentInfoRepository;

@Component
public class InitializerData implements CommandLineRunner{
	
	@Autowired
	private BillAccountRepository billAccountRepository;

	@Autowired
	private BillCycleDataInfoRepository billCycleDataInfoRepository;
	
	@Autowired
	private CreditDetailsRepository creditDetailsRepository;
	
	@Autowired
	private CurrentProductListRepository currentProductRepository;
	
	@Autowired
	private CustomerAttributesRepository customerAttributesRepository;
	
	@Autowired
	private DataAllowanceBarRepository dataAllowanceBarRepository;
	
	@Autowired
	private DataUsageInfoRepository dataUsageInfoRepository;
	
	@Autowired
	private DeviceInfoRepository deviceInfoRepository;
	
	@Autowired
	private EcpdProfileRepository ecpdProfileRepository;
	
	@Autowired
	private EventNotificationRepository eventNotificationRepository;
	
	@Autowired
	private MBillCompareRepository mBillCompareRepository;
	
	@Autowired
	private MobileInfoRepository mobileInfoRepository;
	
	@Autowired
	private MtnDetailsRepository mtnDetailsRepository;
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		insertData();
	}

	public void insertData() {
		
		
	
		saveBillAccountsData();
		saveBillCycleData();
		saveCreditDetailsData();
		saveCurrentProductListData();
		saveCustomerAttributesData();
		saveDataAllowanceBarData();
		saveDataUsageInfoData();
		saveDeviceInfoData();
		saveEcpdProfileData();
		saveEventNotificationData();
		saveMBillCompareData();
		saveMobileInfoData();
		saveMtnDetailsData();
		savePaymentInfoData();
		
	}
	
	public void saveBillAccountsData() {
		
//billAccountRepository
		
		
		List<BillAccountEntity> billAccountEntityList = Arrays.asList(new BillAccountEntity("pavan kuamr", "22092015", "12-03-2009", "10", "334455", 15, "VBCD", "BICD", "ABC", "pavan@gmail.com"),
				new BillAccountEntity("avan kuamr", "22092016", "13-03-2009", "11", "334456", 14, "VBCE", "CICD", "BBC", "avan@gmail.com"),				
				new BillAccountEntity("gavan kuamr", "22092017", "14-03-2009", "12", "334457", 13, "VBCF", "DICD", "LBC", "gavan@gmail.com"),				
				new BillAccountEntity("ravan kuamr", "22092018", "15-03-2009", "13", "334458", 22, "VBCG", "EICD", "GABC", "ravan@gmail.com"),				
				new BillAccountEntity("lavan kuamr", "22092019", "16-03-2009", "14", "334459", 23, "VBCH", "RICD", "AYBC", "lavan@gmail.com")
				);
		
		
		if(billAccountRepository.count()==0) 		
			billAccountRepository.saveAll(billAccountEntityList);
		
		
	}
	
	public void saveBillCycleData() {
		
		
		List<BillCycleDataInfoEntity> billCycleDataInfoEntityList = Arrays.asList(new BillCycleDataInfoEntity("22-01-2001", "22-02-2002"),
				new BillCycleDataInfoEntity("23-01-2001", "22-03-2002"),
				new BillCycleDataInfoEntity("24-01-2001", "22-04-2002"),
				new BillCycleDataInfoEntity("25-01-2001", "22-05-2002"),
				new BillCycleDataInfoEntity("26-01-2001", "22-06-2002"));
		
		//billCycleDataInfoRepository

		if(billCycleDataInfoRepository.count()==0) 		
			billCycleDataInfoRepository.saveAll(billCycleDataInfoEntityList);
	
	}
	
	public void saveCreditDetailsData() {
		
		List<CreditDetailsEntity> creditDetailsEntityList = Arrays.asList(new CreditDetailsEntity("SB44566", "6", "2022", "RUPEE"),
				new CreditDetailsEntity("TB44566", "7", "2023", "DEBIT"),
				new CreditDetailsEntity("HB44566", "8", "2024", "CREDIT"),
				new CreditDetailsEntity("LB44566", "9", "2025", "MASTER"),
				new CreditDetailsEntity("XB44566", "19", "2029", "NASTER"));
		
		if(creditDetailsRepository.count()==0) 		
			creditDetailsRepository.saveAll(creditDetailsEntityList);

		
	}
	
	
	public void saveCurrentProductListData() {
		
		List<CurrentProductListEntity> currentProductListEntityList = Arrays.asList(new CurrentProductListEntity("SPOID", "CREDIT BILL", "SPOUNIA", "SPOGRPA", "SPOLC", "SPOM", "20-02-2019", "28-02-2020", 999.99D, 10, "FRCODE"),
				new CurrentProductListEntity("APOID", "AREDIT BILL", "LPOUNIA", "PPOGRPA", "EPOLC", "LPOM", "21-02-2019", "28-04-2020", 899.99D, 11, "PRCODE"),
				new CurrentProductListEntity("BPOID", "BREDIT BILL", "APOUNIA", "QPOGRPA", "DPOLC", "MPOM", "22-02-2019", "28-05-2020", 799.99D, 12, "QRCODE"),
				new CurrentProductListEntity("CPOID", "DREDIT BILL", "QPOUNIA", "JPOGRPA", "XPOLC", "NPOM", "23-02-2019", "28-01-2020", 699.99D, 13, "ARCODE"),
				new CurrentProductListEntity("DPOID", "GREDIT BILL", "ZPOUNIA", "ZPOGRPA", "CPOLC", "RPOM", "24-02-2019", "28-08-2020", 599.99D, 14, "ZRCODE"));
		
		
		if(currentProductRepository.count()==0) 		
			currentProductRepository.saveAll(currentProductListEntityList);

		
	}
	
	
	
	public void saveCustomerAttributesData() {
		
		List<CustomerAttributesEntity> customerAttributesEntityList = Arrays.asList(new CustomerAttributesEntity("PART-TIME", "YES"),
				new CustomerAttributesEntity("FULL-TIME", "NO"),
				new CustomerAttributesEntity("FULL-TIME", "DELAY"),
				new CustomerAttributesEntity("PART-TIME", "MAX"),
				new CustomerAttributesEntity("FULL-TIME", "MIN"));
		
		if(customerAttributesRepository.count()==0) 		
			customerAttributesRepository.saveAll(customerAttributesEntityList);

		
	}
	
	
	public void saveDataAllowanceBarData() {
		
		
		List<DataAllowanceBarEntity> dataAllowanceBarEntityList = Arrays.asList(
     new DataAllowanceBarEntity(22.22D, "25", 7.5D, "40000", "RED", 88.77D, 12000.22d, 33444.33d, 11999d, "55000", "AAA", "SONY", "LOWBALANCE"),
	new DataAllowanceBarEntity(23.22D, "26", 8.5D, "60000", "YELLOW", 89.77D, 19000.22d, 37444.33d, 12999d, "56000", "BAA", "RONY", "POWBALANCE"),
	 new DataAllowanceBarEntity(24.22D, "27", 9.5D, "70000", "GREEN", 87.77D, 18000.22d, 35444.33d, 13999d, "57000", "CAA", "QONY", "WOWBALANCE"),
	 new DataAllowanceBarEntity(25.22D, "28", 2.5D, "80000", "ORANGE", 86.77D, 17000.22d, 36444.33d, 14999d, "85000", "DAA", "AONY", "KOWBALANCE"),
	 new DataAllowanceBarEntity(26.22D, "29", 1.5D, "90000", "BLACK", 85.77D, 16000.22d, 39444.33d, 15999d, "59000", "EAA", "ZONY", "ZOWBALANCE"));
		
		
		if(dataAllowanceBarRepository.count()==0) 		
			dataAllowanceBarRepository.saveAll(dataAllowanceBarEntityList);

		
	}
	
	public void saveDataUsageInfoData() {
		
		List<DataUsageInfoEntity> dataUsageInfoEntityList = Arrays.asList(new DataUsageInfoEntity("123GB", "1200GB", "150GB", "800GB"),
				new DataUsageInfoEntity("125GB", "1400GB", "170GB", "900GB"),
				new DataUsageInfoEntity("127GB", "1600GB", "1900GB", "700GB"),
				new DataUsageInfoEntity("129GB", "1800GB", "130GB", "600GB"),
				new DataUsageInfoEntity("131GB", "2000GB", "110GB", "500GB"));
		
		
		if(dataUsageInfoRepository.count()==0) 		
			dataUsageInfoRepository.saveAll(dataUsageInfoEntityList);
		

	}
	
	public void saveDeviceInfoData() {
		
		List<DeviceInfoEntity> deviceInfoEntityList = Arrays.asList(new DeviceInfoEntity("MFG", "SONY-GALAXY", "DUAL", "SONY101", "1001", "SONY", "22-01-2021", "4G.B", "SONY-AB", "SONYBRAND", "SNY", "22-09-2019"),
				new DeviceInfoEntity("NFG", "NOKIA", "DUAL", "NOKIA101", "1001", "NOKIA", "22-01-2021", "4G.B", "NOKIA-AB", "NOKIABRAND", "NKA", "22-09-2019"),
				new DeviceInfoEntity("AFG", "AIRTEL", "DUAL", "AIRTEL101", "1001", "AIRTEL", "22-01-2021", "4G.B", "AIRTEL-AB", "SONYBRAND", "ARTL", "22-09-2019"),
				new DeviceInfoEntity("MFG", "REDME", "DUAL", "REDME101", "1001", "REDME", "22-01-2021", "4G.B", "REDME-AB", "REDMEBRAND", "RDM", "22-09-2019"),
				new DeviceInfoEntity("LFG", "MOTO", "DUAL", "MOTO101", "1001", "MOTO", "22-01-2021", "4G.B", "MOTO-AB", "SONYBRAND", "MOTO", "22-09-2019"));
		
		if(deviceInfoRepository.count()==0) 		
			deviceInfoRepository.saveAll(deviceInfoEntityList);

	}
	
	
	public void saveEcpdProfileData() {
		
		List<EcpdProfileEntity> ecpdProfileEntityList = Arrays.asList(new EcpdProfileEntity("CUST-REG", "VZ-1001"),
				new EcpdProfileEntity("CUST-FULL", "VZ-1002"),
				new EcpdProfileEntity("CUST-PART", "VZ-1003"),
				new EcpdProfileEntity("CUST-MAX", "VZ-1004"),
				new EcpdProfileEntity("CUST-MIN", "VZ-1005"));

		if(ecpdProfileRepository.count()==0) 		
			ecpdProfileRepository.saveAll(ecpdProfileEntityList);

	}
	
	
	public void saveEventNotificationData() {
		
		
		List<EventNotificationEntity> eventNotificationEntityList = Arrays.asList(new EventNotificationEntity("EVNT-ABC", "1234"),
				new EventNotificationEntity("EVNT-BBC", "2234"),
				new EventNotificationEntity("EVNT-DBC", "3234"),
				new EventNotificationEntity("EVNT-EBC", "4234"),
				new EventNotificationEntity("EVNT-FBC", "5234"));

		if(eventNotificationRepository.count()==0) 		
			eventNotificationRepository.saveAll(eventNotificationEntityList);

	}
	
	public void saveMBillCompareData() {
		
		List<MBillCompareEntity> mBillCompareEntityList = Arrays.asList(new MBillCompareEntity(44556.76D, "13", 203.03D, 123.32D, 832.23D, 5678.98D, "123.32D", "54.65D", 56.90D, 65.87D),
				new MBillCompareEntity(54556.76D, "23", 303.03D, 223.32D, 732.23D, 1678.98D, "223.32D", "64.65D", 46.90D, 95.87D),
				new MBillCompareEntity(64556.76D, "33", 403.03D, 323.32D, 632.23D, 2678.98D, "323.32D", "74.65D", 36.90D, 65.87D),
				new MBillCompareEntity(74556.76D, "43", 503.03D, 423.32D, 532.23D, 3678.98D, "423.32D", "84.65D", 26.90D, 45.87D),
				new MBillCompareEntity(84556.76D, "53", 603.03D, 523.32D, 332.23D, 4678.98D, "523.32D", "94.65D", 16.90D, 35.87D));

		if(mBillCompareRepository.count()==0) 		
			mBillCompareRepository.saveAll(mBillCompareEntityList);

	}
	
	
	
	public void saveMobileInfoData() {
		
		List<MobileInfoEntity> mobileInfoEntityList = Arrays.asList(new MobileInfoEntity("MTN-101", "22-02-2017", "25-06-2019", "GLOBAL"),
				new MobileInfoEntity("MTN-102", "23-02-2017", "25-07-2019", "LOCAL"),
				new MobileInfoEntity("MTN-103", "24-02-2017", "25-08-2019", "URBAN"),
				new MobileInfoEntity("MTN-104", "25-02-2017", "25-09-2019", "RURAL"),
				new MobileInfoEntity("MTN-105", "27-02-2017", "25-11-2019", "CITY"));
		if(mobileInfoRepository.count()==0) 		
			mobileInfoRepository.saveAll(mobileInfoEntityList);

	
	}
	
	
	public void saveMtnDetailsData() {
		
		List<MtnDetailsEntity> mtnDetailsEntityList = Arrays.asList(new MtnDetailsEntity("MTN-STS", "LOW", "22-02-2020", 127.54d, "IDEA", "FAIL"),
				new MtnDetailsEntity("NTN-STS", "HIGH", "23-02-2020", 137.54d, "VODA", "PASS"),
				new MtnDetailsEntity("WTN-STS", "MEDIUM", "24-02-2020", 147.54d, "AIRTEL", "FAIL"),
				new MtnDetailsEntity("QTN-STS", "AVERAGE", "25-02-2020", 167.54d, "JIO", "FAIL"),
				new MtnDetailsEntity("ZTN-STS", "LOW", "26-02-2020", 117.54d, "DOCOMO", "PASS"));

		if(mtnDetailsRepository.count()==0) 		
			mtnDetailsRepository.saveAll(mtnDetailsEntityList);

		
	}
	
	
	
	public void savePaymentInfoData() {
		
		List<PaymentInfoEntity> paymentInfoEntityList = Arrays.asList(new PaymentInfoEntity("22-03-2020", "3000D", "29-05-2017", "19-10-2019", 234.43d, 1234d, 245d, 121d, "CASH-ONLY", "LOW-BALANCE", "YES", 9999D),
				new PaymentInfoEntity("23-03-2020", "4000D", "19-05-2017", "11-10-2019", 334.43d, 2234d, 345d, 221d, "CARD-ONLY", "FULL-BALANCE", "YES", 8888D),
				new PaymentInfoEntity("24-03-2020", "5000D", "22-05-2017", "12-10-2019", 434.43d, 3234d, 445d, 321d, "PAYTM-ONLY", "NO-BALANCE", "NO", 7777D),
				new PaymentInfoEntity("25-03-2020", "6000D", "23-05-2017", "13-10-2019", 534.43d, 1734d, 545d, 351d, "GOOGLE-PAY-ONLY", "RECHARGE", "YES", 6666D),
				new PaymentInfoEntity("26-03-2020", "7000D", "27-05-2017", "14-10-2019", 634.43d, 1934d, 645d, 371d, "PHONE-PAY-ONLY", "BALANCE", "NO", 5555D));
		
		
		if(paymentInfoRepository.count()==0) 		
			paymentInfoRepository.saveAll(paymentInfoEntityList);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
