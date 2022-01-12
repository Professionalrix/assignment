package com.hygiene.controller;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hygiene.entity.AQIDate;
import com.hygiene.services.AQIDataService;

@RestController
public class AQIDateController {
	@Autowired
	AQIDataService service;
	
	

	@GetMapping("/mydate")
	public List<AQIDate> getDate() {
		return service.getDate();
	}

	@PostMapping("/mydate")
	public AQIDate addDate(@RequestBody AQIDate date) {
		// TODO Auto-generated method stub
		date.setDateTime(new Date());
		return service.addDate(date);
	}

	@PutMapping("/mydate")
	public AQIDate updateDate(@RequestBody AQIDate date) {
		// TODO Auto-generated method stub
		return service.updateDate(date);
	}

	@DeleteMapping("/mydate/{id}")
	public AQIDate deleteDate(@PathVariable Date id) {
		return service.deleteDate(id);
	}

	@GetMapping("/mydate/{date}")
	public ResponseEntity findByDate(@PathVariable("date") @DateTimeFormat(pattern="yyyy-MM-dd") Date date) throws ParseException {
		
		
		
		AQIDate object = service.findByDate(date);
		double data =object.getMeasurementValue();
		double lowerValue=object.getParameter().getThreshhold().getLowerValue();
		double upperValue=object.getParameter().getThreshhold().getLowerValue();
		
		if (object == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error!!! data not found ");
		} 
		else if(data<lowerValue || data >upperValue)
			{
				return ResponseEntity.status(HttpStatus.OK).header("alert", "higher then threshhold value").body(object);
			}
			else
			{
				return ResponseEntity.status(HttpStatus.OK).body(object);
			}
	}
}
