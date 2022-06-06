package com.capg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capg.entity.Transactions;
import com.capg.repository.TransactionsRepo;


@Service
public class TransactionService {
	@Autowired
	TransactionsRepo transRepo;

	public boolean addTransaction(Transactions transaction) {
		transRepo.save(transaction);
		
		return true;
	}

	public List<Transactions> viewTransactions() {
		List<Transactions> listTrans= transRepo.findAll();
		return listTrans;
	}

	public ResponseEntity<?> updateTransaction(Transactions transactions) {
		
		Optional<Transactions> t= Optional.of(new Transactions());
			t= transRepo.findByTransactionId(transactions.getTransactionId());
			
		if(t.get().getAccountNum()!= 0) {
			
			t.get().setAccountNum(transactions.getAccountNum());
			t.get().setAmount(transactions.getAmount());
			t.get().setDescription(transactions.getDescription());
			t.get().setName(transactions.getName());
			t.get().setTransDate(transactions.getTransDate());
			
			return new ResponseEntity<Transactions>(transRepo.saveAndFlush(t.get()), HttpStatus.ACCEPTED);
			
		}else {
			return new ResponseEntity<String>("No Transaction with that Id", HttpStatus.BAD_REQUEST);
		}
	}
	
	public ResponseEntity<?> findTransaction(Integer transId) {
		
		Optional<Transactions> t= Optional.of(new Transactions());
			t= transRepo.findByTransactionId(transId);
			
		if(t.get().getAccountNum()!= 0) {
			
			return new ResponseEntity<Transactions>(t.get(), HttpStatus.ACCEPTED);
			
		}else {
			return new ResponseEntity<String>("No Transaction with that Id", HttpStatus.BAD_REQUEST);
		}
	}
	
	public ResponseEntity<?> deleteTransaction(Integer transId) {
		
		Optional<Transactions> t= Optional.of(new Transactions());
		t= transRepo.findByTransactionId(transId);
		
		if(t.get() != null) {
			transRepo.deleteById(transId);
			
			return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<Boolean>(false, HttpStatus.BAD_REQUEST);
		}
		
	}

}
