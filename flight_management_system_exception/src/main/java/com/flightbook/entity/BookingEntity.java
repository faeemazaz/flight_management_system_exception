package com.flightbook.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BookingEntity {
	@Id
	private Long bookingId;
	private String bookingDate;
	private int noOfPassengers;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passangerId")
	private PassangerEntity passangerEntity;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "flightNo")
	private FlightEntity flightEntity;

	public BookingEntity() {

	}

	public BookingEntity(Long bookingId, String bookingDate, int noOfPassengers, PassangerEntity passangerEntity,
			FlightEntity flightEntity) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.noOfPassengers = noOfPassengers;
		this.passangerEntity = passangerEntity;
		this.flightEntity = flightEntity;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public PassangerEntity getPassangerEntity() {
		return passangerEntity;
	}

	public void setPassangerEntity(PassangerEntity passangerEntity) {
		this.passangerEntity = passangerEntity;
	}

	public FlightEntity getFlightEntity() {
		return flightEntity;
	}

	public void setFlightEntity(FlightEntity flightEntity) {
		this.flightEntity = flightEntity;
	}

}
