package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Account;

import com.capg.service.AccountService;



@RestController
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:4200"},allowedHeaders = "*")
@RequestMapping("/Accounts")

public class AccountController {
	@Autowired
	private AccountService service;

	@PostMapping("/create")
	public ResponseEntity<Account> createAccount(@RequestBody Account Account) {
		Account acc = service.createAccount(Account);
		return new ResponseEntity<Account>(acc, HttpStatus.CREATED);
	}

	@GetMapping("/viewById/{AccountId}")
	public ResponseEntity<Account> viewAccount(@PathVariable("AccountId") int AccountId) {
		Account acc = service.viewAccountById(AccountId);
		return new ResponseEntity<Account>(acc, HttpStatus.OK);
	}

	@GetMapping("/viewAllAccount")
	public List<Account> viewAllAccount() {
		return service.viewAccount();
	}

	@PutMapping("/updateAccount")
	public Account updateAccount(@RequestBody Account Account) {
		
		return service.updateAccount(Account);
	
	}

	@DeleteMapping("/deleteAccount/{AccountId}")
	public void removeAccount(@PathVariable("AccountId") int AccountId) {
		service.removeAccount(AccountId);
	}

}

