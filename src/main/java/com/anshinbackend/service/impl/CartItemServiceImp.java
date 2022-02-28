package com.anshinbackend.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.anshinbackend.dao.CartItemsDAO;
import com.anshinbackend.dao.IGenericDAO;
import com.anshinbackend.entity.CartItems;


public class CartItemServiceImp implements IGenericDAO<CartItems> {
	@Autowired
	private CartItemsDAO cartItemDAO;
	
	@Override
	public Iterable<CartItems> findAll() {
		
		return cartItemDAO.findAll();
	}

	@Override
	public Optional<CartItems> findById(Integer id) {
		
		return cartItemDAO.findById(id);
	}

	@Override
	public CartItems save(CartItems t) {
		
		return cartItemDAO.save(t);
	}

	@Override
	public void remove(Integer id) {
		cartItemDAO.deleteById(id);
		
	}
	
	
	

}