package com.airline.springboot.web.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.airline.springboot.web.app.models.entity.Reservation;

public interface IReservationDao extends CrudRepository<Reservation, Integer>{

}

