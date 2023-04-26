package com.airline.springboot.web.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;
@Entity
@Table(name="statusAirline", schema = "catalog")
public class StatusAirline implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idStatusAirline")
	public Integer idStatusAirline;  
	@Column(name = "description")
	public String description;   
	@Column(name = "registrationDate")
	public Date registrationDate;
	@Nullable 
	@Column(name = "updateDate")
	public Date updateDate;
	@Column(name = "active")
	public boolean active;
	
	public Integer getIdStatusAirline() {
		return idStatusAirline;
	}
	public void setIdStatusAirline(Integer idStatusAirline) {
		this.idStatusAirline = idStatusAirline;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}  
}
