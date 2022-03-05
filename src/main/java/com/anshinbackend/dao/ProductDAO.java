package com.anshinbackend.dao;

import com.anshinbackend.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {
    public List<Product> findByIsDeleteIsFalse();
    public Optional<Product> findById(Integer id);
    @Transactional
    @Modifying
    @Query("update Product p set p.isDelete = true where p.id = ?1")
    public void deleteProduct(Integer id);

    Page<Product> findByIsDeleteIsFalse(Pageable pageable);









}
