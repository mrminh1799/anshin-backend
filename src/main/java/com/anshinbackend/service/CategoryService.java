package com.anshinbackend.service;

import com.anshinbackend.dto.Admin.CategoryDTO;
import com.anshinbackend.dto.NavBar.NavBarDTO;

import java.util.List;

public interface CategoryService {
    List<NavBarDTO> findForNavBar();

    List<CategoryDTO> findAllByCategoryParentId();
}
