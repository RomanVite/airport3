package com.airline.springboot.web.app.join.service;

import java.math.BigDecimal; 
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.airline.springboot.web.app.join.dto.CompanyDto;
import com.airline.springboot.web.app.join.dto.FlighAvailableDto;
import com.airline.springboot.web.app.join.dto.ReservationDto;
import com.airline.springboot.web.app.models.entity.Reservation;
import com.airline.springboot.web.app.repository.CompanyRepository;
import com.airline.springboot.web.app.repository.FlightLogbookRepository;
import com.airline.springboot.web.app.repository.ReservationRepository;


@Service
public class AirlineService  {
	@Resource
	private FlightLogbookRepository flightLogbookRepository;
	@Resource
	private ReservationRepository reservationRepository; 
	@Resource
	private CompanyRepository companyRepository; 

	
	public List<FlighAvailableDto> getFlightsAvailables() {
		List<FlighAvailableDto> list = flightLogbookRepository.getFlightsAvailable(); 
		return list;
	}
	
	public FlighAvailableDto getFlightsAvailableById(Integer id) {
		FlighAvailableDto flightAvailable = flightLogbookRepository.getFlightsAvailableById(id); 
		return flightAvailable;
	}
	
	public List<FlighAvailableDto> getFlightsAvailableByDestination(String destination) {
		List<FlighAvailableDto> listlighAvailable = flightLogbookRepository.getFlightsAvailableByName(destination);  
		return listlighAvailable;
	}
	
	public List<ReservationDto> getReservations() {
		List<ReservationDto> list = reservationRepository.getReservationsAndFlightLogbook(); 
		return list;
	}
	
	public ReservationDto addReservation(Reservation reservation) {
		FlighAvailableDto flightAvailable = flightLogbookRepository.getFlightsAvailableById(reservation.idFlightLogbook);
		ReservationDto reservationDto = new ReservationDto();
		if(flightAvailable.getAvailableWeight().compareTo(reservation.getWeight())>=0 && flightAvailable.getIdStatusFlightLog() == 2) { 
			reservation.setTotalCost( flightAvailable.getPriceByKg().multiply(reservation.weight));
			Calendar cal= Calendar.getInstance();
			int year= cal.get(Calendar.YEAR);
			BigDecimal discount = new BigDecimal(0);
			reservation.setDiscount(discount);
			CompanyDto companyDto = companyRepository.getDiscountCompany(reservation.idCompany, year);
			if(companyDto != null && companyDto.getYear() == year) {
				discount = reservation.getTotalCost().multiply(new BigDecimal(5).divide(new  BigDecimal(100)));  
				reservation.discount = 	discount; 
			}  
			reservation.setGrandTotal(reservation.getTotalCost().subtract((discount != null ? discount : new BigDecimal(0))));
			reservation.setIdStatusReservation(1);
			reservationRepository.saveReservation(reservation.getIdStatusReservation(), reservation.getIdCompany(), reservation.getIdFlightLogbook(), 
					reservation.getTotalCost(), reservation.getDiscount() , reservation.getGrandTotal(), reservation.getWeight());
 
			flightLogbookRepository.updateFlightLogbook(flightAvailable.getIdFlightLogbook(), flightAvailable.getAvailableWeight().subtract(reservation.getWeight()));
			 
			reservationDto = reservationRepository.getReservationById(reservation.getIdCompany(), reservation.getIdFlightLogbook()); 
		} 
		  
		return reservationDto;
	}
	

	public List<CompanyDto> getCompanies() {
		List<CompanyDto> list = companyRepository.getCompanies(); 
		return list;
	}
	 
}

