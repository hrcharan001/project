package com.jsp.springshospital.da0;

import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.jsp.springshospital.dto.Hospital;
import com.jsp.springshospital.repository.HospitalRepo;
import com.jsp.springshospital.util.ResponseStructure;

@Repository
public class HospitalDao {

	@Autowired
	private HospitalRepo repo;
	public Hospital saveHospital(Hospital hospital)
	{
		return repo.save(hospital);
	}
	public Hospital deleteHospital(int id)
	{
		Hospital hospital=repo.findById(id).get();
		repo.delete(hospital);
		return hospital;
	}
	public Hospital getHospitalById(int id)
	{
		Optional<Hospital> hospital=repo.findById(id);
		return hospital.get();
	}
	public Hospital updateHospital(int id,Hospital hospital)
	{
		Optional<Hospital> dbhospital=repo.findById(id);
		if(dbhospital.isPresent())
		{
			hospital.setId(id);
			repo.save(hospital);
			return hospital;
		}
		return null;
	}
	public Hospital findHospitalByName(String name) {
		Hospital hospital=repo.findByName(name);
		if(hospital!=null)
		{
		return hospital;
	}
		return null;
}
	}
