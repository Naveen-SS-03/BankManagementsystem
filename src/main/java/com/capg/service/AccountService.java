package com.capg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Account;
import com.capg.repository.AccountRepository;


 @Service
public class AccountService implements IAccountService {
	@Autowired
	private AccountRepository repository;

	@Override
	public Account createAccount(Account Account) {
		return repository.save(Account);
	}

	@Override
	public Account viewAccountById(int AccountId) {
		return repository.findById(AccountId).get();
	}

	@Override
	public List<Account> viewAccount() {
		List<Account> Account = new ArrayList<Account>();
		repository.findAll().forEach(b1 -> Account.add(b1));
		return Account;
	}

	@Override
	public Account updateAccount(Account Account) {
		
		return repository.save(Account);
	}

	@Override
	public void removeAccount(int AccountId) {
		repository.deleteById(AccountId);
	}

	@Override
	public Account viewAccountById1(int AccountId) {
		// TODO Auto-generated method stub
		return null;
	}
}

