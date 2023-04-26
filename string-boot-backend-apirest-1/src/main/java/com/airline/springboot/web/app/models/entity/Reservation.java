package com.airline.springboot.web.app.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.lang.Nullable;
@Entity
@Table(name="reservation", schema = "airport")
public class Reservation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idReservation")
	public Integer idReservation; 
	@Column(name = "idStatusReservation")
	public Integer idStatusReservation; 
	@Column(name = "idCompany")
	public Integer idCompany; 
	@Column(name = "idFlightLogbook")
	public Integer idFlightLogbook; 
	@Column(name = "totalCost")
	public BigDecimal totalCost; 
	@Column(name = "discount")
	public BigDecimal discount;
	@Column(name = "grandTotal")
	public BigDecimal grandTotal;
	@Column(name = "weight")
	public BigDecimal weight;  
	@Column(name = "registrationDate")
	public java.sql.Date registrationDate;
	@Nullable 
	@Column(name = "updateDate")
	public Date updateDate;
	

	//@OneToMany(targetEntity = FlightLogbook.class, mappedBy = "idFlightLogbook", orphanRemoval = false, fetch = FetchType.LAZY)
	//private Set<FlightLogbook>  flightLogbooks; 
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idFlightLogbook", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private FlightLogbook  flightLogbook; 
	
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
	public java.sql.Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(java.sql.Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}  
	 
}
