package com.anshinbackend.dao;

import com.anshinbackend.dao.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemDAO extends JpaRepository<CartItem, Integer> {

}
