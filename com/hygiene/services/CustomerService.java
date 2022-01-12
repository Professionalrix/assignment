package com.hygiene.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hygiene.entity.Customer;
import com.hygiene.entity.ParameterMaster;
@Service
public interface CustomerService {
	public List<Customer>  getCustomer();
	public Customer createCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(Long id);
}
