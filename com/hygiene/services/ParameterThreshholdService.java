package com.hygiene.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hygiene.entity.ParameterThreshold;
@Service
public interface ParameterThreshholdService {
	public  List <ParameterThreshold> getParameterThreshold();
	public ParameterThreshold addParameterThreshold(ParameterThreshold parameterThreshold);
	public ParameterThreshold updateParameterThreshold(ParameterThreshold parameterThreshold);
	public ParameterThreshold deleteParameterThreshold(Long id);
}
