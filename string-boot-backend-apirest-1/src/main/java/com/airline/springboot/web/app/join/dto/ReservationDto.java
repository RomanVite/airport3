package com.airline.springboot.web.app.join.dto;

import java.math.BigDecimal;
import java.util.Date; 

public class ReservationDto {
	private Integer idReservation;
	private Integer idStatusReservation;
	private Integer idCompany;
	private Integer idFlightLogbook;
	private BigDecimal totalCost; 
	private BigDecimal discount;
	private BigDecimal grandTotal;
	private BigDecimal weight;
	private Date registrationDate; 
	private String numberFight;
	private String airportDestination;
	private Integer flightTime;
	private String airportOrigin;
	
	public ReservationDto() {
		
	}
	
	public ReservationDto(Integer idReservation, Integer idStatusReservation, Integer idCompany, Integer idFlightLogbook,
			BigDecimal totalCost, BigDecimal discount, BigDecimal grandTotal, BigDecimal weight, Date registrationDate, String numberFight, 
			String airportDestination, String airportOrigin, Integer flightTime) {
		this.idReservation = idReservation;
		this.idStatusReservation = idStatusReservation;
		this.idCompany = idCompany;
		this.idFlightLogbook = idFlightLogbook;
		this.totalCost = totalCost;
		this.discount = discount;
		this.grandTotal = grandTotal;
		this.weight = weight;
		this.registrationDate = registrationDate; 
		this.numberFight = numberFight;
		this.airportDestination = airportDestination;
		this.airportOrigin = airportOrigin;
		this.flightTime = flightTime;
	}

	public Integer getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(Integer flightTime) {
		this.flightTime = flightTime;
	}

	public String getAirportOrigin() {
		return airportOrigin;
	}

	public void setAirportOrigin(String airportOrigin) {
		this.airportOrigin = airportOrigin;
	}

	public String getAirportDestination() {
		return airportDestination;
	}

	public void setAirportDestination(String airportDestination) {
		this.airportDestination = airportDestination;
	}

	public String getNumberFight() {
		return numberFight;
	}

	public void setNumberFight(String numberFight) {
		this.numberFight = numberFight;
	}

	public Integer getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Integer idReservation) {
		this.idReservation = idReservation;
	}

	public Integer getIdStatusReservation() {
		return idStatusReservation;
	}

	public void setIdStatusReservation(Integer idStatusReservation) {
		this.idStatusReservation = idStatusReservation;
	}

	public Integer getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Integer idCompany) {
		this.idCompany = idCompany;
	}

	public Integer getIdFlightLogbook() {
		return idFlightLogbook;
	}

	public void setIdFlightLogbook(Integer idFlightLogbook) {
		this.idFlightLogbook = idFlightLogbook;
	}

	public BigDecimal getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
 
}
