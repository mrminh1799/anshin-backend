package com.anshinbackend.service;

import com.anshinbackend.entity.Address;

import java.util.List;

public interface AddressService {
	
	 Address createAndUpdateAddress(Address address);

	 void delete(Integer id);
	 List<Address> findAll();
}
