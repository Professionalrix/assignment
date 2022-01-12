package com.hygiene.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.core.sym.Name;

@Entity
@Table(name ="Parameter_Master")
public class ParameterMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Parameter_id")
	private Long ParameterId;
	
	@Column(name="Parameter_name")
	private String Parameter_name;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "threshhold_id")
	private ParameterThreshold threshhold;
	

	public ParameterMaster(Long parameterId, String parameter_name) {
		ParameterId = parameterId;
		Parameter_name = parameter_name;
	}

	public ParameterMaster() {
	}

	public Long getParameterId() {
		return ParameterId;
	}

	public void setParameterId(Long parameterId) {
		ParameterId = parameterId;
	}

	public String getParameter_name() {
		return Parameter_name;
	}

	public void setParameter_name(String parameter_name) {
		Parameter_name = parameter_name;
	}

	
	  public ParameterThreshold getThreshhold() {
		return threshhold;
	}

	public void setThreshhold(ParameterThreshold threshhold) {
		this.threshhold = threshhold;
	}

	
	 
}
