package com.hygiene.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hygiene.entity.ParameterThreshold;
import com.hygiene.services.ParameterThreshholdService;

@RestController
public class ParameterThreshHoldController {
	@Autowired
	ParameterThreshholdService service;

	@GetMapping("/threshhold")
public List<ParameterThreshold> getDate() {
	return service.getParameterThreshold();
}
	@PostMapping("/threshhold")
public ParameterThreshold addParameterthreshhold(@RequestBody ParameterThreshold threshhold) {
	// TODO Auto-generated method stub
	return service.addParameterThreshold(threshhold);
}
	
	@PutMapping("/threshhold")
public ParameterThreshold updateParameterthreshhold(@RequestBody ParameterThreshold threshhold) {
	// TODO Auto-generated method stub
	return service.updateParameterThreshold(threshhold);
}
	@DeleteMapping("/threshhold/{id}")
public ParameterThreshold deleteParameterthreshhold(@PathVariable Long id) {
	return service.deleteParameterThreshold(id);
}
}
