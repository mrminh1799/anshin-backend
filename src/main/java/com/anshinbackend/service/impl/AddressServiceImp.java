package com.anshinbackend.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.anshinbackend.dao.AddressDAO;
import com.anshinbackend.dao.IGenericDAO;
import com.anshinbackend.entity.Address;

public class AddressServiceImp implements IGenericDAO<Address> {
	@Autowired
	private AddressDAO addressDAO;
	
	@Override
	public Iterable<Address> findAll() {
		
		return addressDAO.findAll();
	}

	@Override
	public Optional<Address> findById(Integer id) {
		
		return addressDAO.findById(id);
	}

	@Override
	public Address save(Address t) {
		
		return addressDAO.save(t);
	}

	@Override
	public void remove(Integer id) {
		addressDAO.deleteById(id);
		
	}
	
	
	
//	@Autowired
//	private AddressDAO addressDAO;
//
//	@Override
//	public List<Address> getAll() {
//		List<Address> list = addressDAO.findAll();
//		return list;
//	}
//
//	@Override
//	public Address getById(int Id) {
//		Address a = addressDAO.getById(Id);
//		return a;
//	}
//
//	@Override
//	public Address insert(Address address) {
//		Address check = addressDAO.save(address);
//		return check;
//	}
//
//	@Override
//	public Address update(Address address) {
//		return addressDAO.save(address);
//	}
//
//	@Override
//	public void delete(int id) {
//
//		addressDAO.deleteById(id);
//		
//	}
}