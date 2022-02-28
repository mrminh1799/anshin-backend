package com.anshinbackend.dao;

import com.anshinbackend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderDAO extends JpaRepository<Order, Integer> {
    @Query("SELECT o FROM Order o WHERE o.account.full_name=?1")
    List<Order> findOrderByName(String full_name);
}
