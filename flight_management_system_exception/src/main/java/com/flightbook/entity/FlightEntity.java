package com.flightbook.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FlightEntity {
	@Id
	private Long flightNo;
	private String carrierName;
	private String flightModel;
	private Long seatCapacity;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "flightEntity")
	private List<BookingEntity> bookings;

	public FlightEntity() {

	}

	public FlightEntity(Long flightNo, String carrierName, String flightModel, Long seatCapacity, List<BookingEntity> bookings) {
		super();
		this.flightNo = flightNo;
		this.carrierName = carrierName;
		this.flightModel = flightModel;
		this.seatCapacity = seatCapacity;
		this.bookings = bookings;
	}

	public Long getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(Long flightNo) {
		this.flightNo = flightNo;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getFlightModel() {
		return flightModel;
	}

	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}

	public Long getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(Long seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public List<BookingEntity> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingEntity> bookings) {
		this.bookings = bookings;
	}

}
