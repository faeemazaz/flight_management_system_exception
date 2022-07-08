package com.flightbook.model;

public class BookingModel {
	private Long bookingId;
	private String bookingDate;
	private int noOfPassengers;
	private Long passangerId;
	private Long flightNo;

	public BookingModel() {

	}

	public BookingModel(Long bookingId, String bookingDate, int noOfPassengers, Long passangerId, Long flightNo) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.noOfPassengers = noOfPassengers;
		this.passangerId = passangerId;
		this.flightNo = flightNo;
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

	public Long getPassangerId() {
		return passangerId;
	}

	public void setPassangerId(Long passangerId) {
		this.passangerId = passangerId;
	}

	public Long getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(Long flightNo) {
		this.flightNo = flightNo;
	}

}
