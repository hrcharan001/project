package com.jsp.springshospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jsp.springshospital.dto.Hospital;

@Repository
public interface HospitalRepo extends JpaRepository<Hospital, Integer> {
//@Query("select a from Hospital a where a.name=?1")
	public Hospital findByName(String name);

	

}
