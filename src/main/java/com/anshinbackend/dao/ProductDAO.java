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

    @Query("SELECT p FROM Product p WHERE p.category.id =?1 \n" +
            "\n" +
            "ORDER BY p.time_create DESC")
    public  List<Product> findAllByIdCategory(Integer id);

    @Query("SELECT p FROM Product p WHERE p.productName like ?1% \n" +
            "\n" +
            "ORDER BY p.time_create DESC")
    public  List<Product> findAllByNameCategory(String name);

    Page<Product> findByIsDeleteIsFalse(Pageable pageable);

}
