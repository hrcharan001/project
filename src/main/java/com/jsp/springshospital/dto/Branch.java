package com.jsp.springshospital.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Branch {
@Id
	private int branchid;
	private String name;
	private String manager;
	@ManyToOne
	private Hospital hospital;
	
	@OneToOne
	private Address address;

	public int getBranchid() {
		return branchid;
	}

	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Branch [branchid=" + branchid + ", name=" + name + ", manager=" + manager + ", hospital=" + hospital
				+ ", address=" + address + "]";
	}
	
	
}
