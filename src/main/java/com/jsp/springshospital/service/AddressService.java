package com.jsp.springshospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.springshospital.da0.AddressDao;
import com.jsp.springshospital.dto.Address;
import com.jsp.springshospital.dto.Hospital;
import com.jsp.springshospital.util.ResponseStructure;

@Service
public class AddressService {
@Autowired
private AddressDao dao;

public ResponseEntity<ResponseStructure<Address>> saveAddress(Address address)
{
	Address addressdb=dao.saveAddress(address);
	ResponseStructure<Address> structure=new ResponseStructure<Address>();
	structure.setMsg("address saved succes");
	structure.setStatus(HttpStatus.CREATED.value());
	structure.setData(addressdb);
return new ResponseEntity<ResponseStructure<Address>>(structure,HttpStatus.CREATED);
}
public ResponseEntity<ResponseStructure<Address>> updateAddress(int id,Address address)
{
	Address addressdb=dao.updateAddress(id,address);
	ResponseStructure<Address> structure=new ResponseStructure<Address>();
	structure.setMsg("address updated succes");
	structure.setStatus(HttpStatus.CREATED.value());
	structure.setData(addressdb);
return new ResponseEntity<ResponseStructure<Address>>(structure,HttpStatus.CREATED);
}
public ResponseEntity<ResponseStructure<Address>> getAddress(int id)
{
	Address address=dao.getAddress(id);
	ResponseStructure<Address> structure=new ResponseStructure<Address>();
	structure.setMsg("address fetched succes");
	structure.setStatus(HttpStatus.CREATED.value());
	structure.setData(address);
return new ResponseEntity<ResponseStructure<Address>>(structure,HttpStatus.CREATED);
}
public ResponseEntity<ResponseStructure<Address>> deleteAddress(int id)
{
	Address addressdb=dao.deleteAddress(id);
	if(addressdb!=null)
	{
	ResponseStructure<Address> structure=new ResponseStructure<Address>();
	structure.setMsg("data deleted");
	structure.setStatus(HttpStatus.FOUND.value());
	structure.setData(addressdb);
	
	return new ResponseEntity<ResponseStructure<Address>>(structure,HttpStatus.FOUND);
}
	else
	{
		ResponseStructure<Address> structure=new ResponseStructure<Address>();
		structure.setMsg("data not deleted");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(addressdb);
		
		return new ResponseEntity<ResponseStructure<Address>>(structure,HttpStatus.NOT_FOUND);
	}

}
}
