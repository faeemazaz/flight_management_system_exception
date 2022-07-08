package com.flightbook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbook.entity.BookingEntity;
import com.flightbook.entity.FlightEntity;
import com.flightbook.entity.PassangerEntity;
import com.flightbook.exception.FlightNotFoundException;
import com.flightbook.model.BookingModel;
import com.flightbook.model.FlightBookingModel;
import com.flightbook.repository.BookingRepo;
import com.flightbook.repository.FlightRepo;
import com.flightbook.repository.PassangerRepo;

@Service
public class FlightBookingServiceImpl implements FlightBookingService {

	@Autowired
	private FlightRepo flightRepo;

	@Autowired
	private BookingRepo bookingRepo;

	@Autowired
	private PassangerRepo passangerRepo;

	@Override
	public FlightEntity insertFlight(FlightEntity flightEntity) {
		return flightRepo.save(flightEntity);
	}

	@Override
	public PassangerEntity insertPassanger(PassangerEntity passangerEntity) {
		return passangerRepo.save(passangerEntity);
	}

	@Override
	public BookingEntity insertBooking(BookingModel bookingModel) {
		Optional<FlightEntity> getFlightReference = flightRepo.findById(bookingModel.getFlightNo());
		Optional<PassangerEntity> getPassangerReference = passangerRepo.findById(bookingModel.getPassangerId());

		BookingEntity bookingEntity = new BookingEntity();
		bookingEntity.setBookingId(bookingModel.getBookingId());
		bookingEntity.setBookingDate(bookingModel.getBookingDate());
		bookingEntity.setNoOfPassengers(bookingModel.getNoOfPassengers());
		bookingEntity.setFlightEntity(getFlightReference.get());
		bookingEntity.setPassangerEntity(getPassangerReference.get());
		return bookingRepo.save(bookingEntity);
	}

	@Override
	public List<FlightBookingModel> findByBookingDate(String bookingDate) throws FlightNotFoundException{
		List<BookingEntity> getBooking = bookingRepo.findByBookingDate(bookingDate);
		List<FlightBookingModel> flightBookingModel = new ArrayList<>();
		if(getBooking.size() == 0)
		{
			flightBookingModel = null;
		}
		else
		{
			for (BookingEntity booking : getBooking) {
				Optional<FlightEntity> getFlightReference = flightRepo.findById(booking.getFlightEntity().getFlightNo());
				Optional<PassangerEntity> getPassangerReference = passangerRepo.findById(booking.getPassangerEntity().getPassangerId());
	
				flightBookingModel.add(new FlightBookingModel(booking.getBookingId(), booking.getBookingDate(),
						booking.getNoOfPassengers(), getPassangerReference.get().getPassangerName(),
						getFlightReference.get().getCarrierName()));
			}
		}
		
		if(flightBookingModel == null)
		{
			throw new FlightNotFoundException("There is no flight on this date !!");
		}
		return flightBookingModel;
	}

}
