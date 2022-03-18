package com.anshinbackend.service;

import com.anshinbackend.dto.Admin.AdminOrderDTO;
import com.anshinbackend.entity.Order;

import java.util.List;

public interface OrderService {
    public void newOrder(Order order, Integer id);
    public void updateOrder(Order order);
    public List<AdminOrderDTO> findAllOrder();
    public List<AdminOrderDTO> findByStatus(Integer status);
    public Order findById(Integer id);
}
