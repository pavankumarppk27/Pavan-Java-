package com.hibernate.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.entity.BankAccount;
import com.hibernate.repo.BankAccountRepo;

@RestController
public class BankAccountController {

	@Autowired
	private BankAccountRepo bankAccountRepo;

	@GetMapping("/saveBankAccountDtls")
	public String saveBankAccountDtls() {

		List<BankAccount> listBankAccountDtls = Arrays.asList(new BankAccount("pavan", "paladugu", 40000d),
				new BankAccount("vasu", "paladugu", 60000d));

		return bankAccountRepo.saveAll(listBankAccountDtls).isEmpty() ? "Not Saved" : "saved";
	}

	@GetMapping("/transfer")
	@Transactional
	public void transfer() {
		
		double amount=500;
		
		BankAccount bankAccount2 = bankAccountRepo.findById(2).get();
		bankAccount2.setBalance(bankAccount2.getBalance()-amount);
		bankAccountRepo.save(bankAccount2);
		
		if(true) {
			throw new RuntimeException();
		}
		
		BankAccount bankAccount1 = bankAccountRepo.findById(1).get();
		bankAccount1.setBalance(bankAccount1.getBalance()+amount);
		bankAccountRepo.save(bankAccount1);

		
	}
}
