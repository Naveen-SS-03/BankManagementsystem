package com.capg.service;

import java.util.List;

import com.capg.entity.Appointment;

public interface AppointmentService {

	Appointment addAppointment(Appointment Appointment);

	List<Appointment> showAllAppointment();
}