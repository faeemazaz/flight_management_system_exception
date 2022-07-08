package com.flightbook.model;

public class PassangerModel {
	private Long passangerId;
	private String passangerName;
	private String passangerGender;
	private Integer passangerAge;

	public PassangerModel(Long passangerId, String passangerName, String passangerGender, Integer passangerAge) {
		this.passangerId = passangerId;
		this.passangerName = passangerName;
		this.passangerGender = passangerGender;
		this.passangerAge = passangerAge;
	}

	public PassangerModel() {

	}

	public Long getPassangerId() {
		return passangerId;
	}

	public void setPassangerId(Long passangerId) {
		this.passangerId = passangerId;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public String getPassangerGender() {
		return passangerGender;
	}

	public void setPassangerGender(String passangerGender) {
		this.passangerGender = passangerGender;
	}

	public Integer getPassangerAge() {
		return passangerAge;
	}

	public void setPassangerAge(Integer passangerAge) {
		this.passangerAge = passangerAge;
	}

}
