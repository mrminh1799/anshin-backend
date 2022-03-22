package com.anshinbackend.dao;

import com.anshinbackend.entity.HistoryOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryOrderDAO extends JpaRepository<HistoryOrder, Integer> {
}
