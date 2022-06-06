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

import com.capg.entity.Appointment;
import com.capg.service.AppointmentServiceImpl;



@RestController
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:4200"},allowedHeaders = "*")
@RequestMapping("/Appointment")
public class AppointmentController {
	
	@Autowired
	private AppointmentServiceImpl AppointmentService;

	
	@PostMapping("/create")
	public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment Appointment) {
		Appointment bd = AppointmentService.addAppointment(Appointment);
		return new ResponseEntity<Appointment>(bd,HttpStatus.CREATED);
	}

	@GetMapping("/getall")
	public List<Appointment> getAllAppointmentDetails(){
		return AppointmentService.showAllAppointment();
	}
}