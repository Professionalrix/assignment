package com.hygiene.entity;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AQI_Date")
public class AQIDate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="AQI_id")
	private long id;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Customer_id")
	private Customer customer;
	/*
	 * @Column(name="Param_id") private Long paramId;
	 */
	
	@Column(name="Date_time")
	private Date dateTime;
	
	@Column(name="Measurement_value")
	private double measurementValue;
	
	@OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinColumn(name ="Param_id")
	private ParameterMaster parameter;


	public AQIDate(long id, Long customerId, Long paramId, Date dateTime, double measurementValue) {
		this.id = id;
	//	this.customerId = customerId;
	//	this.paramId = paramId;
		this.dateTime = dateTime;
		this.measurementValue = measurementValue;
	}

	public AQIDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public double getMeasurementValue() {
		return measurementValue;
	}

	public void setMeasurementValue(double measurementValue) {
		this.measurementValue = measurementValue;
	}

	public ParameterMaster getParameter() {
		return parameter;
	}

	public void setParameter(ParameterMaster parameter) {
		this.parameter = parameter;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
