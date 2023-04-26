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
@Table(name="airline", schema = "airport")
public class Airline implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAirline")
	public Integer idAirline;
	@Column(name = "airlineCode")
	public String airlineCode;
	@Column(name = "name")
	public String name; 
	@Column(name = "registrationDate")
	public Date registrationDate;
	@Nullable 
	@Column(name = "updateDate")
	public Date updateDate;
	@Column(name = "idStatusAirline")
	public int idStatusAirline;

	@PrePersist
	public void prePersist(){
		registrationDate = new Date();
	}
	
	public Integer getIdAirline() {
		return idAirline;
	}

	public void setIdAirline(Integer idAirline) {
		this.idAirline = idAirline;
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

	public int getIdStatusAirline() {
		return idStatusAirline;
	}

	public void setIdStatusAirline(int idStatusAirline) {
		this.idStatusAirline = idStatusAirline;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
