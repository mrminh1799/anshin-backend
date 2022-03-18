package com.anshinbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anshinbackend.dao.AddressDAO;
import com.anshinbackend.entity.Address;
import com.anshinbackend.service.AddressService;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{
	@Autowired
	AddressDAO addressDAO;
	@Override
	public Address createAndUpdateAddress(Address address) {
		
		return addressDAO.save(address);
	}

	@Override
	public void delete(Integer id) {
		addressDAO.deleteById(id);

	}

	@Override
	public List<Address> findAll() {
		return addressDAO.findAll();
	}

}
