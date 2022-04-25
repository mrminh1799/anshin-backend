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
    public void softDelete(Integer id);
    @Query("select p from DetailProduct p where p.color.id =?1 and p.size.id =?2 and p.product.id =?3")
    public DetailProduct findByColorSizeProduct(Integer idColor, Integer idSize, Integer idProduct);

    @Query("SELECT p FROM DetailProduct p WHERE p.product.id =?1")
    public List<DetailProduct> findAllByid(Integer id);


    @Query("SELECT  pd from DetailProduct  pd where pd.product.id =?1 and pd.color.id=?2")
    public  DetailProduct findImage(Integer idProduct, Integer idColor);


}
