package com.anshinbackend.dao;

import com.anshinbackend.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CartItemDAO extends JpaRepository<CartItem, Integer> {

    @Query("Select c from CartItem c where c.account.id = ?1")
    public List<CartItem> findByAcountId(Integer id);


}
