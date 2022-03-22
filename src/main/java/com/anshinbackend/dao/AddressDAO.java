package com.anshinbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anshinbackend.entity.Address;

@Repository
public interface AddressDAO extends JpaRepository<Address, Integer>{


	
}
