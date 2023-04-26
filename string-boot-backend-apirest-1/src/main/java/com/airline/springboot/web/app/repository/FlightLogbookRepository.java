package com.airline.springboot.web.app.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.airline.springboot.web.app.join.dto.FlighAvailableDto;
import com.airline.springboot.web.app.models.entity.FlightLogbook; 

public interface FlightLogbookRepository extends JpaRepository<FlightLogbook, Integer> { 
	@Query("SELECT new com.airline.springboot.web.app.join.dto.FlighAvailableDto(a.idFlightLogbook,a.numberFight, a.idAirline, a.idStatusFlightLog, a.idPrice, a.idAirportOrigin "
			+ " ,a.idAirportDestination, a.availableWeight, a.overallWeight "
			+ ", a.flightTime, a.departureDate, a.arrivalDate, a.registrationDate, b.description, c.name, d.name, f.name, e.priceByKg, b.description,  f.airlineCode ) "
			+ "FROM FlightLogbook a "
			+ "INNER JOIN a.statusFlightLog b "
			+ "INNER JOIN a.airportOrigin c "
			+ "INNER JOIN a.airportDestination d "
			+ "INNER JOIN a.price e "
			+ "INNER JOIN a.airline f "
			+ "Where b.idStatusFlightLog = 2")  
	List<FlighAvailableDto> getFlightsAvailable();
	
	@Query("SELECT new com.airline.springboot.web.app.join.dto.FlighAvailableDto(a.idFlightLogbook,a.numberFight, a.idAirline, a.idStatusFlightLog, a.idPrice, a.idAirportOrigin "
			+ " ,a.idAirportDestination, a.availableWeight, a.overallWeight "
			+ ", a.flightTime, a.departureDate, a.arrivalDate, a.registrationDate, b.description, c.name, d.name, f.name, e.priceByKg, b.description,  f.airlineCode ) "
			+ "FROM FlightLogbook a "
			+ "INNER JOIN a.statusFlightLog b "
			+ "INNER JOIN a.airportOrigin c "
			+ "INNER JOIN a.airportDestination d "
			+ "INNER JOIN a.price e "
			+ "INNER JOIN a.airline f "
			+ "Where b.idStatusFlightLog = 2 and a.idFlightLogbook = :idFlightLogbook")  
	FlighAvailableDto getFlightsAvailableById(@Param("idFlightLogbook") Integer id);
	

	@Query("SELECT new com.airline.springboot.web.app.join.dto.FlighAvailableDto(a.idFlightLogbook,a.numberFight, a.idAirline, a.idStatusFlightLog, a.idPrice, a.idAirportOrigin "
			+ " ,a.idAirportDestination, a.availableWeight, a.overallWeight "
			+ ", a.flightTime, a.departureDate, a.arrivalDate, a.registrationDate, b.description, c.name, d.name, f.name, e.priceByKg, b.description,  f.airlineCode ) "
			+ "FROM FlightLogbook a "
			+ "INNER JOIN a.statusFlightLog b "
			+ "INNER JOIN a.airportOrigin c "
			+ "INNER JOIN a.airportDestination d "
			+ "INNER JOIN a.price e "
			+ "INNER JOIN a.airline f "
			+ "Where b.idStatusFlightLog = 2 and d.name LIKE %:destination%")  
	List<FlighAvailableDto> getFlightsAvailableByName(@Param("destination") String destination);
	

	@Transactional
	@Modifying
	@Query(value = "UPDATE airport.flightLogbook Set availableWeight = :availableWeight, updateDate = getDate() Where idFlightLogbook = :idFlightLogbook ",nativeQuery = true)
    void updateFlightLogbook( @Param("idFlightLogbook")Integer idFlightLogbook, @Param("availableWeight")BigDecimal availableWeight);
	

} 
	  