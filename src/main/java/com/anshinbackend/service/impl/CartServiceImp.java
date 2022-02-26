package com.anshinbackend.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.anshinbackend.dao.CartDAO;
import com.anshinbackend.dao.IGenericDAO;
import com.anshinbackend.entity.Cart;

public class CartServiceImp implements IGenericDAO<Cart> {
	@Autowired
	private CartDAO cartDAO;
	
	@Override
	public Iterable<Cart> findAll() {
		
		return cartDAO.findAll();
	}

	@Override
	public Optional<Cart> findById(Integer id) {
		
		return cartDAO.findById(id);
	}

	@Override
	public Cart save(Cart t) {
		
		return cartDAO.save(t);
	}

	@Override
	public void remove(Integer id) {
		cartDAO.deleteById(id);
		
	}
	
	

}