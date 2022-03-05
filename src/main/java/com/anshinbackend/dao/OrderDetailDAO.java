package com.anshinbackend.dao;

import com.anshinbackend.dao.entity.Order;
import com.anshinbackend.dao.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Integer> {
    List<OrderDetail> findByOrder(Order order);

}
