package com.capg.entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_db")

public class Model {
	@Column(unique = true)
	@Id
	private long userId;
	private String name;
	private String role;
	private String password;
	
}
