package com.anshinbackend.dao;


import com.anshinbackend.dto.CartItemDTO;
import com.anshinbackend.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface CartItemDAO extends JpaRepository<CartItem, Integer> {

    @Query("Select c from CartItem c where c.account.id = ?1")
    public List<CartItem> findByAcountId(Integer id);

    @Transactional
    @Modifying
    @Query("Delete  FROM CartItem as c WHERE c.account.id =?1")
    public void deleteBy(Integer id);

    public Optional<CartItem> findById(Integer id);




    @Transactional
    @Modifying
    @Query("Delete FROM CartItem as c WHERE c.account.id=?1 and c.detailProduct.id = ?2")
    public void deleteByIdProduct(Integer acountid,Integer productid);
}
