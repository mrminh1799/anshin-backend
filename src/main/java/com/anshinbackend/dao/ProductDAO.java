package com.anshinbackend.dao;

import com.anshinbackend.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    @Query("SELECT  p  FROM  Product  p ORDER BY p.time_create DESC")
    public List<Product> findByTop(Pageable pageable);
//    Page<Product> findByTop();

    @Query( "SELECT p1 , sum(o.quantity) FROM OrderDetail  o \n" +
            "INNER join DetailProduct p on o.detailProduct.id = p.id \n" +
            "INNER JOIN Product p1 on p1.id = p.product.id \n" +
            "GROUP BY p1.id, p1.productName \n" +
            "order by sum(o.quantity) DESC ")
    public List<Product> findBySumTop(Pageable pageable);
    Page<Product> findByIsDeleteIsFalse(Pageable pageable);









}
