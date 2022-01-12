package com.hygiene.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hygiene.entity.AQIDate;

@Service
public interface AQIDataService {
	public List<AQIDate> getDate();
	public AQIDate addDate(AQIDate aqiDate);
	public AQIDate updateDate(AQIDate aqiDate);
	public AQIDate deleteDate(Date date);
	public AQIDate findByDate(Date date);
	
}
