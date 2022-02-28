package com.anshinbackend.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.anshinbackend.dao.ColorsDAO;
import com.anshinbackend.dao.IGenericDAO;
import com.anshinbackend.entity.Colors;

public class ColorsServiceImp implements IGenericDAO<Colors> {
	@Autowired
	private ColorsDAO ColorsDAO;
	
	@Override
	public Iterable<Colors> findAll() {
		
		return ColorsDAO.findAll();
	}

	@Override
	public Optional<Colors> findById(Integer id) {
		
		return ColorsDAO.findById(id);
	}

	@Override
	public Colors save(Colors t) {
		
		return ColorsDAO.save(t);
	}

	@Override
	public void remove(Integer id) {
		ColorsDAO.deleteById(id);
		
	}
	
	
	

}