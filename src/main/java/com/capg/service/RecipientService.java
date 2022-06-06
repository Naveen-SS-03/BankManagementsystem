package com.capg.service;

import java.util.List;

import com.capg.entity.Recipient;

public interface RecipientService {

	Recipient addRecipient(Recipient recipient);

	List<Recipient> showAllRecipient();
}