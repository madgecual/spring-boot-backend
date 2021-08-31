package com.assessment.springboot_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.springboot_model.Account;
import com.assessment.springboot_repository.AccountRepo;

@RestController
@RequestMapping("/api/account/")
public class AccountController {
	
	@Autowired
	private AccountRepo acctRepo;
	
	@GetMapping("/allAccounts/")
	public List<Account> getAllAccounts(){
		return acctRepo.findAll();
	}

}
