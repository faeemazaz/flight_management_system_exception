package com.flightbook.model;

public class FlightBookingModel {
	private Long bookingId;
	private String bookingDate;
	private int noOfPassengers;
	private String passangerName;
	private String carrierName;

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

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public FlightBookingModel(Long bookingId, String bookingDate, int noOfPassengers, String passangerName,
			String carrierName) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.noOfPassengers = noOfPassengers;
		this.passangerName = passangerName;
		this.carrierName = carrierName;
	}

	/**
	 * 
	 */
	public FlightBookingModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
