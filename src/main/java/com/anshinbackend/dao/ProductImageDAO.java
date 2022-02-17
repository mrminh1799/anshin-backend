package com.anshinbackend.dao;


import com.anshinbackend.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductImageDAO extends JpaRepository<ProductImage, Integer> {
    public List<ProductImage> findAll();
    public Optional<ProductImage> findById(Integer id);
    @Transactional
    @Modifying
    @Query("delete from ProductImage p  where p.id = ?1")
    public void deleteProduct(Integer id);

    public List<ProductImage> findProductImageByIdProductDetail(Integer id);
}
