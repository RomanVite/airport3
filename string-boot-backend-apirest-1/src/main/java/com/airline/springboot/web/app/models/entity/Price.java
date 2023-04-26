package com.airline.springboot.web.app.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;
@Entity
@Table(name="price", schema = "airport")
public class Price implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPrice")
	public Integer idPrice; 
	@Column(name = "priceByKg")
	public BigDecimal priceByKg;  
	@Column(name = "registrationDate")
	public Date registrationDate;
	@Nullable 
	@Column(name = "updateDate")
	public Date updateDate;
	@Column(name = "idStatusPrice")
	public int idStatusPrice;
	public Integer getIdPrice() {
		return idPrice;
	}
	public void setIdPrice(Integer idPrice) {
		this.idPrice = idPrice;
	}
	public BigDecimal getPriceByKg() {
		return priceByKg;
	}
	public void setPriceByKg(BigDecimal priceByKg) {
		this.priceByKg = priceByKg;
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
	public int getIdStatusPrice() {
		return idStatusPrice;
	}
	public void setIdStatusPrice(int idStatusPrice) {
		this.idStatusPrice = idStatusPrice;
	}
	
	
}
