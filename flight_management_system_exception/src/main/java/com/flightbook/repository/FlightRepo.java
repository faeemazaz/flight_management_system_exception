package com.flightbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightbook.entity.FlightEntity;

@Repository
public interface FlightRepo extends JpaRepository<FlightEntity, Long> {

}
