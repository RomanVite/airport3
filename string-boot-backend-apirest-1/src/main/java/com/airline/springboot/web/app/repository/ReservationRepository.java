package com.airline.springboot.web.app.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.airline.springboot.web.app.join.dto.ReservationDto;
import com.airline.springboot.web.app.models.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
	 
	@Query("SELECT new com.airline.springboot.web.app.join.dto.ReservationDto(a.idReservation,a.idStatusReservation, a.idCompany,a.idFlightLogbook "
			+ ", a.totalCost,a.discount,a.grandTotal,a.weight,a.registrationDate, b.numberFight, c.name, d.name, b.flightTime) "
			+ "FROM Reservation a INNER JOIN a.flightLogbook b INNER JOIN b.airportDestination c INNER JOIN b.airportOrigin d")  
	List<ReservationDto> getReservationsAndFlightLogbook(); 
	 
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO airport.reservation (idStatusReservation, idCompany, idFlightLogbook, totalCost, discount, grandTotal, weight) "
			+ " Values ( :idStatusReservation, :idCompany, :idFlightLogbook, :totalCost, :discount, :grandTotal, :weight )",nativeQuery = true)
    void saveReservation(@Param("idStatusReservation")Integer idStatusReservation, @Param("idCompany")Integer idCompany, @Param("idFlightLogbook")Integer idFlightLogbook,
    		@Param("totalCost")BigDecimal totalCost, @Param("discount")BigDecimal discount, @Param("grandTotal")BigDecimal grandTotal , @Param("weight")BigDecimal weight);
	
	@Query("SELECT new com.airline.springboot.web.app.join.dto.ReservationDto(a.idReservation,a.idStatusReservation, a.idCompany,a.idFlightLogbook "
			+ ", a.totalCost,a.discount,a.grandTotal,a.weight,a.registrationDate, b.numberFight, c.name, d.name, b.flightTime) "
			+ "FROM Reservation a INNER JOIN a.flightLogbook b INNER JOIN b.airportDestination c INNER JOIN b.airportOrigin d "
			+ "Where a.idCompany = :idCompany and a.idFlightLogbook = :idFlightLogbook")   
	ReservationDto getReservationById(@Param("idCompany")Integer idCompany, @Param("idFlightLogbook")Integer idFlightLogbook); 
	 
} 
	 