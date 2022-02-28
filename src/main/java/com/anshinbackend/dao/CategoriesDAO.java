package com.anshinbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshinbackend.entity.Categories;

public interface CategoriesDAO extends JpaRepository<Categories, Integer>{

}
