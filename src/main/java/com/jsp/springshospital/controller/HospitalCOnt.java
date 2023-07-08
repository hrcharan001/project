package com.jsp.springshospital.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springshospital.dto.Hospital;
import com.jsp.springshospital.service.HospitalService;
import com.jsp.springshospital.util.ResponseStructure;

@RestController
public class HospitalCOnt {

	@Autowired
	private HospitalService service;
	
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(@RequestBody @Valid Hospital hospital)
	{
		return service.saveHospital(hospital);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<Hospital>> deleteHospital(@RequestParam int id)
	{
		return service.deleteHospital(id);
	}

	@PutMapping("/updatehospital")
	public ResponseEntity<ResponseStructure<Hospital>> updateHospital(@RequestParam int id,@RequestBody Hospital hospital)

	{
		return service.updateHospital(id,hospital);
	}
	
	@GetMapping("/gethospital")
	public ResponseEntity<ResponseStructure<Hospital>> getHospital(@RequestParam int id)

	{
		return service.getHospital(id);
	}
	@GetMapping("/getname")
	public ResponseEntity<ResponseStructure<Hospital>> findHospitalByName(@RequestParam String name)
	{
		return service.findHospitalByName(name);
	}
}
