package com.flightbook.model;

public class FlightModel {
	private Long flightNo;
	private String carrierName;
	private String flightModel;
	private Long seatCapacity;

	/**
	 * 
	 */
	public FlightModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param flightNo
	 * @param carrierName
	 * @param flightModel
	 * @param seatCapacity
	 */
	public FlightModel(Long flightNo, String carrierName, String flightModel, Long seatCapacity) {
		super();
		this.flightNo = flightNo;
		this.carrierName = carrierName;
		this.flightModel = flightModel;
		this.seatCapacity = seatCapacity;
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

}
