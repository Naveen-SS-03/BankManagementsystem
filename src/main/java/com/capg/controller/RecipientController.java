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
import com.capg.entity.Recipient;
import com.capg.service.RecipientServiceImpl;


@RestController
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:4200"},allowedHeaders = "*")
@RequestMapping("/RecipientDetails")
public class RecipientController {
	
	@Autowired
	private RecipientServiceImpl RecipientService;

	
	@PostMapping("/AddRecipient")
	public ResponseEntity<Recipient> createRecipient(@RequestBody Recipient Recipient) {
		Recipient bd = RecipientService.addRecipient(Recipient);
		return new ResponseEntity<Recipient>(bd,HttpStatus.CREATED);
	}

	@GetMapping("/list")
	public List<Recipient> getAllRecipientDetails(){
		return RecipientService.showAllRecipient();
	}
}