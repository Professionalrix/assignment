package com.hygiene.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hygiene.entity.ParameterMaster;
@Service
public interface ParameterMasterService {
public List<ParameterMaster>  getParameter();
public ParameterMaster createParameter(ParameterMaster parameterMaster);
public ParameterMaster updateParameter(ParameterMaster parameterMaster);
public ParameterMaster deleteParameter(Long id);
}
