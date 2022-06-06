package com.capg.service;

import java.util.List;

import com.capg.entity.Account;

public interface IAccountService {
Account createAccount(Account Account);
	
	Account viewAccountById(int AccountId);
	
	List<Account> viewAccount();
	
	Account updateAccount(Account Account);
	
	void removeAccount(int AccountId);

	Account viewAccountById1(int AccountId);
}
