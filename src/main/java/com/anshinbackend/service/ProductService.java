package com.anshinbackend.service;

import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService extends GenericService<Product, Integer> {
    public List<Product> findAll();
    public Product findById(Integer id);
    public Product inset(Product p);
    public Product update(Product p);
    public Integer delete(Integer id);
    public List<ProductDTO> findAllPage(Integer currentPage, Integer sizePage);



}
