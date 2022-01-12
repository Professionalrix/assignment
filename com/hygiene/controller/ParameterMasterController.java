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

import com.hygiene.entity.ParameterMaster;
import com.hygiene.services.ParameterMasterService;

@RestController
public class ParameterMasterController {
	@Autowired
	ParameterMasterService service;

	@GetMapping("/parameter")
public List<ParameterMaster> getDate() {
	return service.getParameter();
}
	@PostMapping("/parameter")
public ParameterMaster addParameter(@RequestBody ParameterMaster parameter) {
	// TODO Auto-generated method stub
	return service.createParameter(parameter);
}
	
	@PutMapping("/parameter")
public ParameterMaster updateParameter(@RequestBody ParameterMaster parameter) {
	// TODO Auto-generated method stub
	return service.updateParameter(parameter);
}
	@DeleteMapping("/parameter/{id}")
public ParameterMaster deleteParameter(@PathVariable Long id) {
	return service.deleteParameter(id);
}
}
