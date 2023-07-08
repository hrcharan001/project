package com.jsp.springshospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.springshospital.dto.Address;

@Repository
public interface Addressrepo extends JpaRepository<Address, Integer>{

}
