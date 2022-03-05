package com.anshinbackend.dao;

import com.anshinbackend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDAO extends JpaRepository<Category, Integer> {
    @Query("select  c from Category c where  c.categoryParentId= 0  and c.isDeleted =false ")
    List<Category> findForNavbar();

    List<Category> findByCategoryParentId(Integer id);
}
