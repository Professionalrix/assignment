package com.hygiene.entity;

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

@Entity
@Table(name="Parameter_Threshold")
public class ParameterThreshold {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Param_id")
	private Long paramIid;
	
	@Column(name="Lower_value")
	private double lowerValue;
	
	@Column(name="Upper_value")
	private double upperValue;
	
	/*
	 * @OneToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "paramasterId") private ParameterMaster master;
	 */
	 
	public ParameterThreshold(Long paramIid, double lowerValue, double upperValue) {
		this.paramIid = paramIid;
		this.lowerValue = lowerValue;
		this.upperValue = upperValue;
	}

	public ParameterThreshold() {
	}

	public Long getParamIid() {
		return paramIid;
	}

	public void setParamIid(Long paramIid) {
		this.paramIid = paramIid;
	}

	public double getLowerValue() {
		return lowerValue;
	}

	public void setLowerValue(double lowerValue) {
		this.lowerValue = lowerValue;
	}

	public double getUpperValue() {
		return upperValue;
	}

	public void setUpperValue(double upperValue) {
		this.upperValue = upperValue;
	}

	/*
	 * public Long getParamasterId() { return paramasterId; }
	 * 
	 * public void setParamasterId(Long paramasterId) { this.paramasterId =
	 * paramasterId; }
	 */

	
	/*
	 * public ParameterMaster getMaster() { return master; }
	 * 
	 * public void setMaster(ParameterMaster master) { this.master = master; }
	 * 
	 */
	 
}
