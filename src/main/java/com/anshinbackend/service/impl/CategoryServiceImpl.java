package com.anshinbackend.service.impl;

import com.anshinbackend.dao.CategoryDAO;
import com.anshinbackend.dto.NavBar.NavBarChildDTO;
import com.anshinbackend.dto.NavBar.NavBarDTO;
import com.anshinbackend.entity.Category;
import com.anshinbackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDAO _categoryDAO;
    @Override
    public List<NavBarDTO> findForNavBar() {
        List<NavBarDTO> list = new ArrayList<>();
        _categoryDAO.findForNavbar().forEach(x->{
            NavBarDTO e = new NavBarDTO();
            e.setIdCategory(x.getId());
            e.setNameCategory(x.getCategoryName());

            List<NavBarChildDTO> listChild = new ArrayList<>();
            _categoryDAO.findByCategoryParentId(x.getId()).forEach(y->{
                NavBarChildDTO navBarChildDTO = new NavBarChildDTO(y.getId(), y.getCategoryName());
                listChild.add(navBarChildDTO);
            });
            e.setListChild(listChild);
            list.add(e);
        });
        return list;
    }

    @Override
    public List<Category> findAll() {
        return _categoryDAO.findAll();
    }



    @Override
    public Category create(Category category) {
        return _categoryDAO.save(category);
    }

    @Override
    public Category update(Category category) {
        return _categoryDAO.save(category);
    }

    @Override
    public Integer delete(Integer id) {
        _categoryDAO.deleteCate(id);
        return  1;
    }
}
