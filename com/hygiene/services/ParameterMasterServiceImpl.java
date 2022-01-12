package com.hygiene.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hygiene.entity.Customer;
import com.hygiene.entity.ParameterMaster;
import com.hygiene.repository.ParameterMasterRepository;

@Service
public class ParameterMasterServiceImpl implements ParameterMasterService {
	
	@Autowired
	ParameterMasterRepository repo;
	
	@Override
	public List<ParameterMaster> getParameter() {
		return repo.findAll();
	}

	@Override
	public ParameterMaster createParameter(ParameterMaster parameterMaster) {
		// TODO Auto-generated method stub
		return repo.save(parameterMaster);
	}

	@Override
	public ParameterMaster updateParameter(ParameterMaster parameterMaster) {
		// TODO Auto-generated method stub
		return repo.save(parameterMaster);
	}

	@Override
	public ParameterMaster deleteParameter(Long id) {
		Optional<ParameterMaster> object = repo.findById(id);

		if (object == null) {
			throw new RuntimeException("data not found");
		} else {
			repo.delete(object.get());
			return object.get();
		}
	}
	}


