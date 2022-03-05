package com.anshinbackend.service;

import com.anshinbackend.entity.CartItem;

import java.util.List;

public interface CartItemService {
    public List<CartItem> findByAccountId(Integer id);
    public List<CartItem> findAll();
}
