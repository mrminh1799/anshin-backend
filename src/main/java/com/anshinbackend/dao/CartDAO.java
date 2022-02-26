package com.anshinbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshinbackend.entity.Cart;

public interface CartDAO extends JpaRepository<Cart, Integer>{

}
