package com.anshinbackend.service;

import com.anshinbackend.entity.Order;

public interface OrderService {
    public void newOrder(Order order, Integer id);
}
