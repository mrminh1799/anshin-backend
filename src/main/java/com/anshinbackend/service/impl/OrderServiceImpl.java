package com.anshinbackend.service.impl;

import com.anshinbackend.dao.OrderDAO;
import com.anshinbackend.dao.OrderDetailDAO;
import com.anshinbackend.entity.Detail_orders;
import com.anshinbackend.entity.Order;
import com.anshinbackend.service.OrderService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import java.util.stream.Collectors;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDAO dao;

    @Autowired
    OrderDetailDAO ddao;

    @Override
    public Order create(JsonNode orderData) {
        ObjectMapper mapper = new ObjectMapper();

        Order order = mapper.convertValue(orderData, Order.class);
        dao.save(order);

        TypeReference<List<Detail_orders>> type = new TypeReference<List<Detail_orders>>() {};
        List<Detail_orders> details = mapper.convertValue(orderData.get("orderDetails"), type).stream()
                .peek(d -> d.setOrder(order)).collect(Collectors.toList());
        ddao.saveAll(details);

        return order;

    }

    @Override
    public Order findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public List<Order> findOrderByName(String full_name) {
        return dao.findOrderByName(full_name);
    }
}
