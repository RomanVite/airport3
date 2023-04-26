package com.airline.springboot.web.app.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.lang.Nullable;
@Entity
@Table(name="flightLogbook", schema = "airport")
public class FlightLogbook implements Serializable {

 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFlightLogbook")
	public Integer idFlightLogbook; 
	@Column(name = "numberFight")
	public String numberFight; 
	@Column(name = "idStatusFlightLog")
	public Integer idStatusFlightLog; 
	@Column(name = "idAirline")
	public Integer idAirline; 
	@Column(name = "idPrice")
	public Integer idPrice; 
	@Column(name = "idAirportOrigin")
	public Integer idAirportOrigin; 
	@Column(name = "idAirportDestination")
	public Integer idAirportDestination;  
	@Column(name = "availableWeight")
	public BigDecimal availableWeight; 
	@Column(name = "overallWeight")
	public BigDecimal overallWeight; 
	@Column(name = "flightTime")
	public Integer flightTime;   
	@Column(name = "departureDate")
	public Timestamp departureDate; 
	@Column(name = "arrivalDate")
	public Timestamp arrivalDate;  
	@Column(name = "registrationDate")
	public Timestamp  registrationDate;
	@Nullable 
	@Column(name = "updateDate")
	public Date updateDate;
	@Column(name = "idStatusAirline")
	public int idStatusAirline;
   
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idStatusFlightLog", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private StatusFlightLog  statusFlightLog; 
 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAirportOrigin", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Airport  airportOrigin;
	 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAirportDestination", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Airport  airportDestination;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPrice", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Price  price;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAirline", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Airline  airline;
	
	
	@PrePersist 
	public void prePersist(){
		//egistrationDate = new Timestamp();
		//departureDate = new Date();
		//arrivalDate = new Date();
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
	public Integer getIdAirline() {
		return idAirline;
	}
	public void setIdAirline(Integer idAirline) {
		this.idAirline = idAirline;
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
	public Timestamp getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Timestamp departureDate) {
		this.departureDate = departureDate;
	}
	public Timestamp getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Timestamp arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Timestamp getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Timestamp registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getIdStatusAirline() {
		return idStatusAirline;
	}
	public void setIdStatusAirline(int idStatusAirline) {
		this.idStatusAirline = idStatusAirline;
	} 
}
