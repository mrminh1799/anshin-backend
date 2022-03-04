package com.anshinbackend.dao;

import com.anshinbackend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<Order, Integer> {
}
