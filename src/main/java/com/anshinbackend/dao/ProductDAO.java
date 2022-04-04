package com.anshinbackend.dao;

import com.anshinbackend.entity.Discount;
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



    @Query("SELECT p FROM Product p WHERE p.productName like ?1% \n" +
            "\n" +
            "ORDER BY p.time_create DESC")
    public  List<Product> findAllByNameCategory(String name);



    @Query(nativeQuery = false, value = "SELECT p, s FROM Discount  d\n" +
            "     JOIN Product p on p.id = d.product.id \n" +
            "     JOIN SaleEvent  s on s.id = d.saleEvent.id \n" +
            "    WHERE   s.startTime <= current_date and s.endTime >= CURRENT_DATE \n" +
            "    GROUP BY p.id")
    List<Product> findAllBySaleEvent();

    @Transactional
    @Modifying
    @Query("update Product p set p.status = ?1 where p.id = ?2")
    public void updateStatus(Integer status, Integer idProduct);
}
