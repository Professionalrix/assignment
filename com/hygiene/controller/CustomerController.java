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

import com.hygiene.entity.Customer;
import com.hygiene.services.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService service;

	@GetMapping("/customer")
public List<Customer> getDate() {
	return service.getCustomer();
}
	@PostMapping("/customer")
public Customer addCustomer(@RequestBody Customer customer) {
	// TODO Auto-generated method stub
	return service.createCustomer(customer);
}
	
	@PutMapping("/customer")
public Customer updateCustomer(@RequestBody Customer customer) {
	// TODO Auto-generated method stub
	return service.updateCustomer(customer);
}
	@DeleteMapping("/customer/{id}")
public Customer deleteCustomer(@PathVariable Long id) {
	return service.deleteCustomer(id);
}
}
