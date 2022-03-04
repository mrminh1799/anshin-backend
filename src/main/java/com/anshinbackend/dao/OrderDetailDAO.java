package com.anshinbackend.dao;

import com.anshinbackend.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Integer> {

}
