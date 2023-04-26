package com.airline.springboot.web.app.models.services;

import java.util.List;

import com.airline.springboot.web.app.models.entity.Reservation;

public interface IReservationService {
	public List<Reservation> findAll();
	public Reservation save(Reservation airline);
	public Reservation findById(Integer id); 
	public void delete(Integer id);
}
