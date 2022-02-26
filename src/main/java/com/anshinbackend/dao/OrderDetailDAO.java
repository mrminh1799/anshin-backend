package com.anshinbackend.dao;

import com.anshinbackend.entity.Detail_orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailDAO extends JpaRepository<Detail_orders, Integer> {

}
