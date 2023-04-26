package com.airline.springboot.web.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airline.springboot.web.app.join.dto.CompanyDto;
import com.airline.springboot.web.app.join.dto.FlighAvailableDto;
import com.airline.springboot.web.app.join.dto.ReservationDto;
import com.airline.springboot.web.app.join.service.AirlineService;
import com.airline.springboot.web.app.models.entity.Reservation;

@RestController
@RequestMapping("/api")
public class AirlineClientRestController {
	/* 
	 * @Autowired private AirlineQueryService airlineService;
	 */ 
	@Autowired
	private AirlineService airlineService;

	//Method to get all reservations
	@GetMapping("/fight/reservation/all")
	public ResponseEntity<List<ReservationDto>> getReservations() {
		return new ResponseEntity<List<ReservationDto>>(airlineService.getReservations(), HttpStatus.OK);
	}
	//Method to get all fight available
	@GetMapping("/fight/available/all")
	public ResponseEntity<List<FlighAvailableDto>> getFightsAvalilables() {
		return new ResponseEntity<List<FlighAvailableDto>>(airlineService.getFlightsAvailables(), HttpStatus.OK);
	}
	
	//Method to get all companies
	@GetMapping("/fight/company/all")
	public ResponseEntity<List<CompanyDto>> getCompanies() {
		return new ResponseEntity<List<CompanyDto>>(airlineService.getCompanies(), HttpStatus.OK);
	}
	//Method to get fight available by id
	@GetMapping("/fight/avalilable/id/{id}")
	public ResponseEntity<FlighAvailableDto> getFightsAvalilablesById(@PathVariable Integer id) {
		return new ResponseEntity<FlighAvailableDto>(airlineService.getFlightsAvailableById(id), HttpStatus.OK);
	}
	//Method to get fight available by name destination
	@GetMapping("/fight/avalilable/name/{destination}")
	public ResponseEntity<List<FlighAvailableDto>> getFightsAvalilableById(@PathVariable String destination) {
		return new ResponseEntity<List<FlighAvailableDto>>(airlineService.getFlightsAvailableByDestination(destination), HttpStatus.OK);
	}
	//Method to add a reservation
	@PutMapping("/fight/reservation")
	public ResponseEntity<ReservationDto> addReservation(@RequestBody Reservation reservation) {
		return new ResponseEntity<ReservationDto>(airlineService.addReservation(reservation), HttpStatus.OK);
	}
}
