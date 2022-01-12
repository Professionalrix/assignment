package com.hygiene.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hygiene.entity.Customer;
import com.hygiene.repository.CustomerRepository;

@Service
public class CustmerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository repo;

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public Customer deleteCustomer(Long id) {
		Optional<Customer> object = repo.findById(id);

		if (object == null) {
			throw new RuntimeException("data not found");
		} else {
			repo.delete(object.get());
			return object.get();
		}
	}

}
