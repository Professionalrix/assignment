package com.hygiene.repository;


import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hygiene.entity.AQIDate;

public interface AQIDateRepository extends JpaRepository<AQIDate,Long> {
	public AQIDate findByDateTime(Date date);
}
