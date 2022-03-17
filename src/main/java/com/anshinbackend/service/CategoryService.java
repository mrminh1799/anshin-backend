package com.anshinbackend.service;

import com.anshinbackend.dto.NavBar.NavBarDTO;
import com.anshinbackend.entity.Category;
import com.anshinbackend.entity.Size;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<NavBarDTO> findForNavBar();
    List<Category> findAll();


    Category create(Category category);

    Category update(Category category);

    void delete(Integer id);
}
