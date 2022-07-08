package com.flightbook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightbook.entity.BookingEntity;
@Repository
public interface BookingRepo extends JpaRepository<BookingEntity, Long>{
	List<BookingEntity> findByBookingDate(String bookingDate);
}
