package com.jsp.springshospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.springshospital.da0.HospitalDao;
import com.jsp.springshospital.dto.Hospital;
import com.jsp.springshospital.util.ResponseStructure;

@Service
public class HospitalService {

	@Autowired
	private HospitalDao dao;
	
	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(Hospital hospital)
  
	{
		Hospital dbhospital=dao.saveHospital(hospital);
	
	ResponseStructure<Hospital> structure=new ResponseStructure<Hospital>();
	structure.setMsg("data saved");
	structure.setStatus(HttpStatus.CREATED.value());
	structure.setData(dbhospital);
	
	return new ResponseEntity<ResponseStructure<Hospital>>(structure,HttpStatus.CREATED);
	
	}
	
	public ResponseEntity<ResponseStructure<Hospital>> deleteHospital(int id)
	{
		Hospital dbHospital=dao.deleteHospital(id);
		if(dbHospital!=null)
		{
		ResponseStructure<Hospital> structure=new ResponseStructure<Hospital>();
		structure.setMsg("data deleted");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(dbHospital);
		
		return new ResponseEntity<ResponseStructure<Hospital>>(structure,HttpStatus.FOUND);
	}
		else
		{
			ResponseStructure<Hospital> structure=new ResponseStructure<Hospital>();
			structure.setMsg("data not deleted");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(dbHospital);
			
			return new ResponseEntity<ResponseStructure<Hospital>>(structure,HttpStatus.NOT_FOUND);
		}


}
	public ResponseEntity<ResponseStructure<Hospital>> getHospital(int id)
	{
		Hospital dbhospital=dao.getHospitalById(id);
		ResponseStructure<Hospital> structure=new ResponseStructure<Hospital>();
		structure.setMsg("hospital fetched succes");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(dbhospital);
		return new ResponseEntity<ResponseStructure<Hospital>>(structure,HttpStatus.FOUND);
	}
	public ResponseEntity<ResponseStructure<Hospital>> updateHospital(int id,Hospital hospital)
	{
		Hospital dbhospital=dao.updateHospital(id, hospital);
		ResponseStructure<Hospital> structure=new ResponseStructure<Hospital>();
		structure.setMsg("hospital updated succes");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(dbhospital);
		return new ResponseEntity<ResponseStructure<Hospital>>(structure,HttpStatus.CREATED);
	
	}

	public ResponseEntity<ResponseStructure<Hospital>> findHospitalByName(String name) {
		Hospital dbhospital= dao.findHospitalByName(name);
		if(dbhospital!=null)
		{
			ResponseStructure<Hospital> structure=new ResponseStructure<Hospital>();
			structure.setMsg("data fetched successfully based on given name");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(dbhospital);
			return new ResponseEntity<ResponseStructure<Hospital>>(structure,HttpStatus.FOUND);
		}
		return null;
	}

}