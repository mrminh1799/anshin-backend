package com.anshinbackend.service.impl;

import com.anshinbackend.dao.ProductDAO;
import com.anshinbackend.entity.Product;
import com.anshinbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDAO _productDAO;

    @Override
    public List<Product> findAll() {
        return _productDAO.findByIsDeleteIsFalse();
    }

    @Override
    public Product findById(Integer id) {
        return _productDAO.findById(id).get();
    }

    @Override
    public Product inset(Product p) {
        p.setIsDelete(false);
        Integer id = _productDAO.save(p).getId();
        p.setId(id);
        return p;
    }

    @Override
    public Product update(Product p) {
        return _productDAO.save(p);

    }

    @Override
    public Integer delete(Integer id) {
        _productDAO.deleteProduct(id);
        return  1;
    }
}
