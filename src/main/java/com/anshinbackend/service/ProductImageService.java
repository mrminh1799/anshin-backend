package com.anshinbackend.service;

import com.anshinbackend.entity.ProductImage;

import java.util.List;

public interface ProductImageService {
    public List<ProductImage> findAll();
    public ProductImage findById(Integer id);

    public void delete(Integer id);

}
