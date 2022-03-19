package com.anshinbackend.service;

import com.anshinbackend.dto.CartItemDTO;
import com.anshinbackend.entity.CartItem;

import java.util.List;

public interface CartItemService {
    public List<CartItemDTO> findByAccountId(Integer id);
    public List<CartItem> findAll();
    public void Create(CartItem cartItem);
}
