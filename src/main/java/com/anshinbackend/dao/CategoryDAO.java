package com.anshinbackend.dao;

import com.anshinbackend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryDAO extends JpaRepository<Category, Integer> {
    @Query("select  c from Category c where  c.categoryParentId= 0  and c.isDeleted =false ")
    List<Category> findForNavbar();

    //Việt anh
    @Query("select  c from Category c where  c.id= ?1  and c.isDeleted =false ")
    List<Category> findForNavbar1(Integer id);


    List<Category> findByCategoryParentId(Integer id);

    @Transactional
    @Modifying
    @Query("update Category c set c.isDeleted = true where c.id = ?1")
    public void deleteCate(Integer id);


}
