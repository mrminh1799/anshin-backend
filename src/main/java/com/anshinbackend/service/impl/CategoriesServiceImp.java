package com.anshinbackend.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.anshinbackend.dao.CategoriesDAO;
import com.anshinbackend.dao.IGenericDAO;
import com.anshinbackend.entity.Categories;

public class CategoriesServiceImp implements IGenericDAO<Categories> {
	@Autowired
	private CategoriesDAO categoriesDAO;
	
	@Override
	public Iterable<Categories> findAll() {
		
		return categoriesDAO.findAll();
	}

	@Override
	public Optional<Categories> findById(Integer id) {
		
		return categoriesDAO.findById(id);
	}

	@Override
	public Categories save(Categories t) {
		
		return categoriesDAO.save(t);
	}

	@Override
	public void remove(Integer id) {
		categoriesDAO.deleteById(id);
		
	}
	
	
	

}