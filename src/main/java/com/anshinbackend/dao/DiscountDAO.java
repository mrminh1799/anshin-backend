package com.anshinbackend.dao;

import com.anshinbackend.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountDAO extends JpaRepository<Discount, Integer> {
}
