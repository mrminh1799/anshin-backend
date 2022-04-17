package com.anshinbackend.service.impl;

import com.anshinbackend.dao.CategoryDAO;

import com.anshinbackend.dto.Admin.CategoryDTO;
import com.anshinbackend.dto.Customer.ProductDTO;

import com.anshinbackend.dto.Admin.CategoriDTO;

import com.anshinbackend.dto.NavBar.NavBarChildDTO;
import com.anshinbackend.dto.NavBar.NavBarDTO;
import com.anshinbackend.entity.Category;
import com.anshinbackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<CategoryDTO> findAllByCategoryParentId() {
        List<CategoryDTO> list = new ArrayList<>();
        _categoryDAO.findAllByCategoryParentId().forEach(x -> {
            CategoryDTO e = new CategoryDTO();
            e.setId(x.getId());
            e.setName(x.getCategoryName());
            list.add(e);
        });
return  list;
    }


    public List<Category> findAll() {
        return _categoryDAO.findAll();
    }



    @Override
    public List<Category> findByCategoryParentId(Integer id) {
        return _categoryDAO.findByCategoryParentId(id);
    }

    //code viet anh

    @Override
    public List<CategoriDTO> findForNavbar1(Integer id) {
        List<CategoriDTO> list = new ArrayList<>();
        _categoryDAO.findForNavbar1(id).forEach(x->{
            CategoriDTO e = new CategoriDTO();
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
    public List<CategoryDTO> findByCon() {
        List<CategoryDTO> list = new ArrayList<>();
        _categoryDAO.findByCon().forEach(x->{
            Category categoryParent =  _categoryDAO.findById(x.getCategoryParentId()).get();
            list.add(new CategoryDTO(x.getId(),x.getCategoryName(),categoryParent.getId(),categoryParent.getCategoryName()));
        });
            return  list;

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
