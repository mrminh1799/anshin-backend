package com.anshinbackend.dao;

import com.anshinbackend.entity.Acount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AcountDAO extends JpaRepository<Acount, Integer> {
    public List<Acount> findByIsDeletedIsFalse();
}
