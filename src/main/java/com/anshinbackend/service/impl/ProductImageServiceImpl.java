package com.anshinbackend.service.impl;

import com.anshinbackend.dao.ProductImageDAO;
import com.anshinbackend.entity.ProductImage;
import com.anshinbackend.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImageServiceImpl implements ProductImageService {
@Autowired
    private ProductImageDAO _productImageDAO;
    @Override
    public List<ProductImage> findAll() {
        return _productImageDAO.findAll();
    }

    @Override
    public ProductImage findById(Integer id) {
        return _productImageDAO.findById(id).get();
    }


    @Override
    public void delete(Integer id) {
        _productImageDAO.deleteProduct(id);
    }
}
