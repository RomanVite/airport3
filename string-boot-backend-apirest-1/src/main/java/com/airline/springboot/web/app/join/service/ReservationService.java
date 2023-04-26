package com.airline.springboot.web.app.join.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.airline.springboot.web.app.models.dao.IReservationDao;
import com.airline.springboot.web.app.models.entity.Reservation;
import com.airline.springboot.web.app.models.services.IReservationService;

public class ReservationService implements IReservationService{

	@Autowired
	private IReservationDao reservationDao;
	
	@Override 
	@Transactional(readOnly = true)
	public List<Reservation> findAll() {
		// TODO Auto-generated method stub
		return (List<Reservation>) reservationDao.findAll();
	}

	@Override
	@Transactional
	public Reservation save(Reservation airline) {
		// TODO Auto-generated method stub
		return (Reservation) reservationDao.save(airline);
	}

	@Override
	@Transactional(readOnly = true)
	public Reservation findById(Integer id) {
		// TODO Auto-generated method stub
		return (Reservation) reservationDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		reservationDao.deleteById(id);
	}
}