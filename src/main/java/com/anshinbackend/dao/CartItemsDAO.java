package com.anshinbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshinbackend.entity.CartItems;

public interface CartItemsDAO extends JpaRepository<CartItems, Integer>{

}
