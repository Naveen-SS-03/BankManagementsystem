package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Transactions;
import com.capg.service.TransactionService;




@RestController
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:4200"},allowedHeaders = "*")
@RequestMapping(path = "/Transaction")
public class TransactionController {
	
	
	@Autowired
	TransactionService trans;
	
	@PostMapping(path = "/create")
	public ResponseEntity<String> saveTransactions(@RequestBody Transactions transaction)
			 {
		ResponseEntity<String> response = null;
		if (trans.addTransaction(transaction))
			response = new ResponseEntity<String>(
					"transaction with id " + transaction.getTransactionId() + " is done", HttpStatus.CREATED);
		return response;
	}
	
	@GetMapping(path = "/getall")
	public ResponseEntity<List<Transactions>> getAllTransactions(){
		ResponseEntity<List<Transactions>> response = null;
		List<Transactions> list = trans.viewTransactions();
		response = new ResponseEntity<List<Transactions>>(list, HttpStatus.OK);
		return response;
	}


}
