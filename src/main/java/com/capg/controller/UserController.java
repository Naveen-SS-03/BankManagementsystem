package com.capg.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Credentials;
import com.capg.entity.Model;
import com.capg.service.UserService;

@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:4200"},allowedHeaders = "*")
@RestController
@RequestMapping("/log")


public class UserController {
	@Autowired 
	private UserService userService;

	/*---Add new user---*/
	@PostMapping("/user")
	public ResponseEntity<?> save(@RequestBody Model user) {
		userService.save(user);
		return ResponseEntity.ok().body("New User has been saved ");
	}

	/*---Get a user by id---*/
	@GetMapping("/user/{id}")
	public ResponseEntity<Model> get(@PathVariable("id") long id) {
		Model user = userService.get(id);
		return ResponseEntity.ok().body(user);
	}

	/*---get all users---*/
	@GetMapping("/user")
	public ResponseEntity<List<Model>> list() {
	    List<Model> user = userService.list();
	    return ResponseEntity.ok().body(user);
	}

	/*---Update a user by id---*/
	@PutMapping("/user/{id}")
	public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Model user) {
	     userService.update(id, user);
	     return ResponseEntity.ok().body("User has been updated successfully.");
	}

	/*---Delete a user by id---*/
	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") long id) {
		 userService.delete(id);
	     return ResponseEntity.ok().body("User has been deleted successfully.");
	}
	/*---Get a user by id---*/
	@PostMapping("/login")
	public ResponseEntity <?> get(@RequestBody Credentials cred) {
		boolean log = userService.existsByNameAndPassword(cred.getName(), cred.getPassword());
		if(log!=true) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
		}
		else{
			return ResponseEntity.ok().body(true);
		}
	}

}
