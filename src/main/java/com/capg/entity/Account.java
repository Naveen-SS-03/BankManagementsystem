package com.capg.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int accountnumber;
	private String accountholdername;
	private String accounttype;
	private int accountholderage;
	private String address;
	private String pancardnumber;
	private String nationality;
	private BigDecimal accountBalance;

	public Account() {
	}

}
