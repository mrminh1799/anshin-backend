package com.anshinbackend.dao;

import com.anshinbackend.entity.SaleEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface SaleEventDAO extends JpaRepository<SaleEvent, Integer> {
    public List<SaleEvent> findByIsDeletedIsFalse();

    public Optional<SaleEvent> findById(Integer id);
    @Transactional
    @Modifying
    @Query("update SaleEvent s set s.isDeleted = true where s.id = ?1")
    public void deleteSaleEventById(Integer id);
}
