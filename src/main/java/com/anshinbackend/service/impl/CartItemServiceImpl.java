package com.anshinbackend.service.impl;

import com.anshinbackend.dao.CartItemDAO;
import com.anshinbackend.entity.CartItem;
import com.anshinbackend.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartItemServiceImpl implements CartItemService {
    @Autowired
    CartItemDAO _cartItemDao;
    @Override
    public List<CartItem> findByAccountId(Integer id) {
        return null;
    }

    @Override
    public List<CartItem> findAll() {
        return _cartItemDao.findAll();
    }
}
