package com.anshinbackend.service;

import com.anshinbackend.entity.Order;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public interface OrderService {
    Order create(JsonNode orderData);
    Order findById(Integer id);
    List<Order> findOrderByName(String full_name);
}
