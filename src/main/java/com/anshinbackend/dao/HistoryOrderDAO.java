package com.anshinbackend.dao;

import com.anshinbackend.entity.HistoryOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryOrderDAO extends JpaRepository<HistoryOrder, Integer> {

    @Query("select h from  HistoryOrder  h where h.order.id=?1 order by h.idCurentHistory desc ")
    List<HistoryOrder> findHistory(Integer idOrder);


}
