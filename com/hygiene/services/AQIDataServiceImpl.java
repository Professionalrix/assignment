package com.hygiene.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hygiene.entity.AQIDate;
import com.hygiene.repository.AQIDateRepository;

@Service
public class AQIDataServiceImpl implements AQIDataService {

	@Autowired
	 AQIDateRepository repo;
	@Override
	public List<AQIDate> getDate() {
		
		return repo.findAll();
	}

	@Override
	public AQIDate addDate(AQIDate aqiDate) {
		
		return repo.save(aqiDate);
	}

	@Override
	public AQIDate updateDate(AQIDate aqiDate) {
		return repo.save(aqiDate);
	}

	@Override
	public AQIDate deleteDate(Date date)  {
		
		AQIDate object=repo.findByDateTime(date);
		
		if(object==null)
		{
			throw new RuntimeException("data not found");
		}
		else {
			repo.delete(object);
			return object;
		}
		
	}

	@Override
	public AQIDate findByDate(Date date) {
		return repo.findByDateTime(date);
	}

	
}
