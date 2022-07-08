package com.flightbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flightbook.entity.FlightEntity;
import com.flightbook.entity.PassangerEntity;
import com.flightbook.exception.FlightNotFoundException;
import com.flightbook.model.BookingModel;
import com.flightbook.model.FlightBookingModel;
import com.flightbook.service.FlightBookingService;

@RestController
public class FlighBookingController {
	@Autowired
	private FlightBookingService flightBookingService;

	// insert flight
	@RequestMapping(value = "/flight", method = RequestMethod.POST)
	public ResponseEntity<FlightEntity> insertFlight(@RequestBody FlightEntity flightEntity) {
		flightBookingService.insertFlight(flightEntity);
		return ResponseEntity.ok(flightEntity);
	}

	// insert passenger
	@RequestMapping(value = "/passanger", method = RequestMethod.POST)
	public ResponseEntity<PassangerEntity> insertPassanger(@RequestBody PassangerEntity passangerEntity) {
		flightBookingService.insertPassanger(passangerEntity);
		return ResponseEntity.ok(passangerEntity);
	}

	// insert booking
	@RequestMapping(value = "/booking", method = RequestMethod.POST)
	public ResponseEntity<BookingModel> insertBooking(@RequestBody BookingModel bookingModel) {
		flightBookingService.insertBooking(bookingModel);
		return ResponseEntity.ok(bookingModel);
	}

	// fetch all flights booking based on booking date
	@RequestMapping(value = "/flightbooking/{bookingDate}", method = RequestMethod.GET)
	public ResponseEntity<List<FlightBookingModel>> getFlightBookingFromBookingDate(@PathVariable String bookingDate) throws FlightNotFoundException{
		return ResponseEntity.ok(flightBookingService.findByBookingDate(bookingDate));
	}

}
