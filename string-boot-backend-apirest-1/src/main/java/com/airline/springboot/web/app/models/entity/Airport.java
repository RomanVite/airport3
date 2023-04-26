package com.airline.springboot.web.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="airport", schema = "airport")
public class Airport implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAirport")
	public Integer idAirport;
	
	@Column(name = "airlineCode")
	public String airlineCode;
	
	@Column(name = "name")
	public String name;
	 
	@Column(name = "idStatusAirport")
	public Integer idStatusAirport;
	
	@Column(name = "idCountry")
	public Integer idCountry;
	
	@Column(name = "idCity")
	public Integer idCity;
	
	 
	@Column(name = "registrationDate")
	public Date registrationDate;
	
	@Nullable 
	@Column(name = "updateDate")
	public Date updateDate;
	 
	
	public Integer getIdAirport() {
		return idAirport;
	}
 
	public void setIdAirport(Integer idAirport) {
		this.idAirport = idAirport;
	}
 
	public String getAirlineCode() {
		return airlineCode;
	}
 
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public Integer getIdStatusAirport() {
		return idStatusAirport;
	}
 
	public void setIdStatusAirport(Integer idStatusAirport) {
		this.idStatusAirport = idStatusAirport;
	}
 
	public Integer getIdCountry() {
		return idCountry;
	}
 
	public void setIdCountry(Integer idCountry) {
		this.idCountry = idCountry;
	}
 
	public Integer getIdCity() {
		return idCity;
	}
 
	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}
 
	public Date getRegistrationDate() {
		return registrationDate;
	}
 
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
 
	public Date getUpdateDate() {
		return updateDate;
	}
 
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
 
	@PrePersist
	public void prePersist(){
		registrationDate = new Date();
	}
}
