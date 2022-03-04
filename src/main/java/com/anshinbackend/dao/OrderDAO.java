package com.anshinbackend.dao;

import com.anshinbackend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDAO extends JpaRepository<Order, Integer> {
    public List<Order> findByReturnOrderIsFalseOrderByTimeCreateDesc();

}
