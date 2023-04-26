package com.airline.springboot.web.app.join.dto;

import java.math.BigDecimal;
import java.util.Date;
 

public class FlighAvailableDto {
	private Integer idFlightLogbook;
	private String numberFight;
	private Integer idAirline;
	private Integer idStatusFlightLog;
	private Integer idPrice; 
	private Integer idAirportOrigin;
	private Integer idAirportDestination;
	private BigDecimal availableWeight;
	private BigDecimal overallWeight;
	private Integer flightTime;
	private Date departureDate;
	private Date arrivalDate;
	private Date registrationDate;
	private String descriptionStatusFlight;
	private String nameAirpotOrigin;
	private String nameAirpotDestination;
	private String nameAirline; 
	private BigDecimal priceByKg;
	private String descriptionStatusFlightLog; 
	private String airlineCode;
	
	public FlighAvailableDto(Integer idFlightLogbook, String numberFight, Integer idAirline, Integer idStatusFlightLog, Integer idPrice
			, Integer idAirportOrigin, Integer idAirportDestination, BigDecimal availableWeight, BigDecimal overallWeight, Integer flightTime, Date departureDate
			, Date arrivalDate, Date registrationDate, String descriptionStatusFlight, String nameAirpotOrigin, String nameAirpotDestination, String nameAirline, BigDecimal priceByKg
			, String descriptionStatusFlightLog, String airlineCode) {
		this.idFlightLogbook = idFlightLogbook;
		this.numberFight = numberFight;
		this.idAirline = idAirline;
		this.idStatusFlightLog = idStatusFlightLog;
		this.idPrice = idPrice;
		this.idAirportOrigin = idAirportOrigin;
		this.idAirportDestination = idAirportDestination;
		this.availableWeight = availableWeight;
		this.overallWeight = overallWeight;
		this.flightTime = flightTime;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.registrationDate = registrationDate;
		this.descriptionStatusFlight = descriptionStatusFlight;
		this.nameAirpotOrigin = nameAirpotOrigin;
		this.nameAirpotDestination = nameAirpotDestination;
		this.nameAirline = nameAirline; 
		this.priceByKg = priceByKg;
		this.airlineCode = airlineCode;
		this.descriptionStatusFlightLog = descriptionStatusFlightLog;
	}

	
 
	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public Integer getIdAirline() {
		return idAirline;
	}

	public void setIdAirline(Integer idAirline) {
		this.idAirline = idAirline;
	}

	public BigDecimal getPriceByKg() {
		return priceByKg;
	}

	public void setPriceByKg(BigDecimal priceByKg) {
		this.priceByKg = priceByKg;
	}

	public String getDescriptionStatusFlightLog() {
		return descriptionStatusFlightLog;
	}

	public void setDescriptionStatusFlightLog(String descriptionStatusFlightLog) {
		this.descriptionStatusFlightLog = descriptionStatusFlightLog;
	}

	public Integer getIdFlightLogbook() {
		return idFlightLogbook;
	}

	public void setIdFlightLogbook(Integer idFlightLogbook) {
		this.idFlightLogbook = idFlightLogbook;
	}

	public String getNumberFight() {
		return numberFight;
	}

	public void setNumberFight(String numberFight) {
		this.numberFight = numberFight;
	}

	public Integer getIdStatusFlightLog() {
		return idStatusFlightLog;
	}

	public void setIdStatusFlightLog(Integer idStatusFlightLog) {
		this.idStatusFlightLog = idStatusFlightLog;
	}

	public Integer getIdPrice() {
		return idPrice;
	}

	public void setIdPrice(Integer idPrice) {
		this.idPrice = idPrice;
	}

	public Integer getIdAirportOrigin() {
		return idAirportOrigin;
	}

	public void setIdAirportOrigin(Integer idAirportOrigin) {
		this.idAirportOrigin = idAirportOrigin;
	}

	public Integer getIdAirportDestination() {
		return idAirportDestination;
	}

	public void setIdAirportDestination(Integer idAirportDestination) {
		this.idAirportDestination = idAirportDestination;
	}

	public BigDecimal getAvailableWeight() {
		return availableWeight;
	}

	public void setAvailableWeight(BigDecimal availableWeight) {
		this.availableWeight = availableWeight;
	}

	public BigDecimal getOverallWeight() {
		return overallWeight;
	}

	public void setOverallWeight(BigDecimal overallWeight) {
		this.overallWeight = overallWeight;
	}

	public Integer getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(Integer flightTime) {
		this.flightTime = flightTime;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getDescriptionStatusFlight() {
		return descriptionStatusFlight;
	}

	public void setDescriptionStatusFlight(String descriptionStatusFlight) {
		this.descriptionStatusFlight = descriptionStatusFlight;
	}

	public String getNameAirpotOrigin() {
		return nameAirpotOrigin;
	}

	public void setNameAirpotOrigin(String nameAirpotOrigin) {
		this.nameAirpotOrigin = nameAirpotOrigin;
	}

	public String getNameAirpotDestination() {
		return nameAirpotDestination;
	}

	public void setNameAirpotDestination(String nameAirpotDestination) {
		this.nameAirpotDestination = nameAirpotDestination;
	}

	public String getNameAirline() {
		return nameAirline;
	}

	public void setNameAirline(String nameAirline) {
		this.nameAirline = nameAirline;
	}
 
}
