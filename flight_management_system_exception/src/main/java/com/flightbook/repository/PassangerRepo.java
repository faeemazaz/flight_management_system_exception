package com.flightbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightbook.entity.PassangerEntity;

public interface PassangerRepo extends JpaRepository<PassangerEntity, Long> {

}
