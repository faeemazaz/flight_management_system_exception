package com.flightbook.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PassangerEntity {
	@Id
	private Long passangerId;
	private String passangerName;
	private String passangerGender;
	private Integer passangerAge;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "passangerEntity")
	private List<BookingEntity> bookings;

	public PassangerEntity(Long passangerId, String passangerName, String passangerGender, Integer passangerAge,
			List<BookingEntity> bookings) {
		this.passangerId = passangerId;
		this.passangerName = passangerName;
		this.passangerGender = passangerGender;
		this.passangerAge = passangerAge;
		this.bookings = bookings;
	}

	public PassangerEntity() {
		
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

	public List<BookingEntity> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingEntity> bookings) {
		this.bookings = bookings;
	}

}
