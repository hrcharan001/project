package com.jsp.springshospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springshospital.dto.Address;
import com.jsp.springshospital.service.AddressService;
import com.jsp.springshospital.util.ResponseStructure;

@RestController
public class AddressCont {

	@Autowired
	private AddressService service;
	@PostMapping("/saveaddress")
	public ResponseEntity<ResponseStructure<Address>> saveAddress(@RequestBody Address address)
	{
		return service.saveAddress(address);
	}
	@PutMapping("/updateaddress")
	public ResponseEntity<ResponseStructure<Address>> updateAddress(@RequestParam int id,@RequestBody Address address)
	{
		return service.updateAddress(id,address);
	}
	@GetMapping("/getAddress")
	public ResponseEntity<ResponseStructure<Address>> getAddress(@RequestParam int id)
	{
		return service.getAddress(id);

	}
	@DeleteMapping("/deleteaddress")
	public ResponseEntity<ResponseStructure<Address>> deleteAddress(@RequestParam int id)
	{
		return service.deleteAddress(id);
	}


	
}
