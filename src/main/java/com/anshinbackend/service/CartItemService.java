package com.anshinbackend.service;

import com.anshinbackend.entity.CartItem;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

public interface CartItemService {
    public List<CartItem> findByAccountId(Integer id);
    public List<CartItem> findAll();
}
