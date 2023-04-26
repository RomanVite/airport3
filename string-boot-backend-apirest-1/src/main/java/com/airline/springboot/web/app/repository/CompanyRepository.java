package com.airline.springboot.web.app.repository;
 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.airline.springboot.web.app.join.dto.CompanyDto;
import com.airline.springboot.web.app.models.entity.Company; 

public interface CompanyRepository  extends JpaRepository<Company, Integer>{
	@Query("SELECT new com.airline.springboot.web.app.join.dto.CompanyDto( a.idCompany, a.nameCompany,a.registrationDate,a.idStatusCompany, b.year) "
			+ "FROM Company a INNER JOIN a.companyDiscount b where a.idCompany = :idCompany and b.year = :year ")  
	CompanyDto getDiscountCompany(@Param("idCompany") Integer id, @Param("year") Integer year); 
	
	@Query("SELECT new com.airline.springboot.web.app.join.dto.CompanyDto( a.idCompany, a.nameCompany,a.registrationDate,a.idStatusCompany) "
			+ "FROM Company a where a.idStatusCompany = 1")  
	List<CompanyDto> getCompanies(); 
}
