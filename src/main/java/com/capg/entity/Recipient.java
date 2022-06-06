package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Recipient {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private long phonenumber;	
	private int accountnumber;
	
	public Recipient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recipient(int id, String name, int phonenumber, int accountnumber) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.accountnumber = accountnumber;
	}

	
}
