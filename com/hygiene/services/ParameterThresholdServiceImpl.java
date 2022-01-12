package com.hygiene.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hygiene.entity.ParameterThreshold;
import com.hygiene.repository.ParameterThresholdRepository;

@Service
public class ParameterThresholdServiceImpl implements ParameterThreshholdService {

	@Autowired
	ParameterThresholdRepository repo;
	@Override
	public List<ParameterThreshold> getParameterThreshold() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public  ParameterThreshold addParameterThreshold(ParameterThreshold parameterThreshold) {
		// TODO Auto-generated method stub
		return repo.save(parameterThreshold);
	}

	@Override
	public ParameterThreshold updateParameterThreshold(ParameterThreshold parameterThreshold) {
		// TODO Auto-generated method stub
		return repo.save(parameterThreshold);
	}

	@Override
	public ParameterThreshold deleteParameterThreshold(Long id) {
		Optional<ParameterThreshold> object = repo.findById(id);

		if (object == null) {
			throw new RuntimeException("data not found");
		} else {
			repo.delete(object.get());
			return object.get();
		}
	}

}
