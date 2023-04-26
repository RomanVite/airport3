package com.airline.springboot.web.app.models.entity;

import java.io.Serializable;
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
@Table(name="company", schema = "airport")
public class Company implements Serializable{
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCompany")
	public Integer idCompany; 
	@Column(name = "nameCompany")
	public String nameCompany;  
	@Column(name = "registrationDate")
	public Date registrationDate;
	@Nullable 
	@Column(name = "updateDate")
	public Date updateDate;
	@Column(name = "idStatusCompany")
	public Integer idStatusCompany;

	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCompany", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private CompanyDiscount  companyDiscount; 
	
	@PrePersist
	public void prePersist(){
		registrationDate = new Date();
	}
	 
	public Integer getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Integer idCompany) {
		this.idCompany = idCompany;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
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

	public Integer getIdStatusCompany() {
		return idStatusCompany;
	}

	public void setIdStatusCompany(Integer idStatusCompany) {
		this.idStatusCompany = idStatusCompany;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
