package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.entity.Appointment;
import com.capg.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	@Autowired
	private AppointmentRepository AppointmentRepository;

	@Override
	public Appointment addAppointment(Appointment Appointment){
	       return AppointmentRepository.save(Appointment);
	}

	@Override
	public List<Appointment> showAllAppointment() {
		return AppointmentRepository.findAll();
	}


}