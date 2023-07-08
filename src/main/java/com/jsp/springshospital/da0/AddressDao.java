package com.jsp.springshospital.da0;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springshospital.dto.Address;
import com.jsp.springshospital.repository.Addressrepo;

@Repository
public class AddressDao {
@Autowired
private Addressrepo repo1;
public Address saveAddress(Address address)
{
	return repo1.save(address);
		
}
public Address updateAddress(int id,Address address)
{
	Optional<Address> optional=repo1.findById(id);
	if(optional.isPresent())
	{
		address.setId(id);
		repo1.save(address);
		return address;
	}
	return null;
}
public Address getAddress(int id)
{
	Optional<Address> optional1=repo1.findById(id);
	return optional1.get();
}
public Address deleteAddress(int id)
{
	Address address=repo1.findById(id).get();
	repo1.delete(address);
	return address;
}
}
