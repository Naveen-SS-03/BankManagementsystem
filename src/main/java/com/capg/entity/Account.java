package com.capg.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Account {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private int accountnumber;
 private String accountholdername;
 private String accounttype;
 private BigDecimal accountBalance;
 
 public Account() {
 }

 public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getAccountnumber() {
	return accountnumber;
}

public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
}

public String getAccountholdername() {
	return accountholdername;
}

public void setAccountholdername(String accountholdername) {
	this.accountholdername = accountholdername;
}

public String getAccounttype() {
	return accounttype;
}

public void setAccounttype(String accounttype) {
	this.accounttype = accounttype;
}

public BigDecimal getAccountBalance() {
	return accountBalance;
}

public void setAccountBalance(BigDecimal accountBalance) {
	this.accountBalance = accountBalance;
}
 
}