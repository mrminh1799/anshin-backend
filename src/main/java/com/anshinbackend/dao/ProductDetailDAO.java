package com.anshinbackend.dao;

import com.anshinbackend.entity.DetailProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductDetailDAO  extends JpaRepository<DetailProduct, Integer> {
    public List<DetailProduct> findByIsDeletedIsFalse();
    public Optional<DetailProduct> findById(Integer id);
    @Transactional
    @Modifying
    @Query("update DetailProduct p set p.isDeleted = true where p.id = ?1")
    public void deleteAcount(Integer id);
}
