package com.airline.springboot.web.app.join.dto;

import java.util.Date;
 

public class CompanyDto {

	
	public Integer idCompany;  
	public String nameCompany;  
	public Date registrationDate;   
	public Integer idStatusCompany; 
	public Integer year;
	
	public CompanyDto(Integer idCompany, String nameCompany, Date registrationDate, Integer idStatusCompany, Integer year) {
		this.idCompany = idCompany;
		this.nameCompany = nameCompany;
		this.registrationDate = registrationDate;
		this.idStatusCompany = idStatusCompany;  
		this.year = year;  
	}
	

	public CompanyDto(Integer idCompany, String nameCompany, Date registrationDate, Integer idStatusCompany) {
		this.idCompany = idCompany;
		this.nameCompany = nameCompany;
		this.registrationDate = registrationDate;
		this.idStatusCompany = idStatusCompany;     
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
	public int getIdStatusCompany() {
		return idStatusCompany;
	}
	public void setIdStatusCompany(int idStatusCompany) {
		this.idStatusCompany = idStatusCompany;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	} 
}
