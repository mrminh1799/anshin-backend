package com.anshinbackend.service;

import com.anshinbackend.entity.DetailProduct;

import java.util.List;

public interface DetailProductService {

    public List<DetailProduct> findAll();
    public DetailProduct findById(Integer id);
    public DetailProduct insert(DetailProduct p);
    public DetailProduct update(DetailProduct p);
    public void delete(Integer p);


}
