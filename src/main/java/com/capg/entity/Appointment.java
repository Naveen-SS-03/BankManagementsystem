package com.capg.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Appointment {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	 private String name;
	 private String email;
	 private long phonenumber;
	 private String location;
	 private Date date;
	 private String description;
	  
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(int id, String name, String email, int phonenumber, String location, Date date, String description) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.location = location;
		this.date = date;
		this.description = description;
	}	
}
