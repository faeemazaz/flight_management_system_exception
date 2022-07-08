package com.flightbook.service;

import java.util.List;

import com.flightbook.entity.BookingEntity;
import com.flightbook.entity.FlightEntity;
import com.flightbook.entity.PassangerEntity;
import com.flightbook.exception.FlightNotFoundException;
import com.flightbook.model.BookingModel;
import com.flightbook.model.FlightBookingModel;

public interface FlightBookingService {
	FlightEntity insertFlight(FlightEntity flightEntity);
	PassangerEntity insertPassanger(PassangerEntity passangerEntity);
	BookingEntity insertBooking(BookingModel bookingModel);
	
	List<FlightBookingModel> findByBookingDate(String bookingDate) throws FlightNotFoundException;
	
}
