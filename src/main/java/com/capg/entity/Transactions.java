package com.capg.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transactionId ;
	private int accountNum;
	private String description;
	private String name;
	private int recipeintacc;
	private int amount;
	private Date transDate;
	
	
	public Transactions(int transactionId, int accountNum, String description,String name, int amount, Date transDate , int recipeintacc ) {
		super();
		this.transactionId = transactionId;
		this.accountNum = accountNum;
		this.description = description;
		this.name = name;
		this.amount = amount;
		this.recipeintacc = recipeintacc;
		this.transDate = transDate;
	}
	public Transactions() {
		super();
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public int getRecipeintacc() {
		return recipeintacc;
	}
	public void setRecipeintacc(int recipeintacc) {
		this.recipeintacc = recipeintacc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
