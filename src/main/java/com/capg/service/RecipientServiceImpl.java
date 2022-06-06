package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.entity.Recipient;
import com.capg.repository.RecipientRepository;

@Service
public class RecipientServiceImpl implements RecipientService{
	@Autowired
	private RecipientRepository recipientRepository;

	@Override
	public Recipient addRecipient(Recipient recipient){
	       return recipientRepository.save(recipient);
	}

	@Override
	public List<Recipient> showAllRecipient() {
		return recipientRepository.findAll();
	}


}