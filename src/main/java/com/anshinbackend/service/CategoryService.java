package com.anshinbackend.service;

import com.anshinbackend.dto.Admin.CategoriDTO;
import com.anshinbackend.dto.NavBar.NavBarDTO;
import com.anshinbackend.entity.Category;

import java.util.List;

public interface CategoryService {
    List<NavBarDTO> findForNavBar();
    List<Category> findAll();

    //Việt anh
    List<CategoriDTO> findForNavbar1(Integer id);

    List<Category> findByCategoryParentId(Integer id);


    Category create(Category category);

    Category update(Category category);

    Integer delete(Integer id);
}
