package com.jsp.springshospital.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
@Id
	private int id;
	private long pincode;
	private String state;
	private String city;
	private String Country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", pincode=" + pincode + ", state=" + state + ", city=" + city + ", Country="
				+ Country + "]";
	}
	

}