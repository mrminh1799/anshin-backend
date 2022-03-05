package com.anshinbackend.service.impl;

import com.anshinbackend.dao.ProductDetailDAO;
import com.anshinbackend.entity.DetailProduct;
import com.anshinbackend.service.DetailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailProductServiceImpl implements DetailProductService {

    @Autowired
    ProductDetailDAO _productDetailDAO;

    @Override
    public List<DetailProduct> findAll(){
        return  _productDetailDAO.findByIsDeletedIsFalse();
    }
    @Override
    public DetailProduct findById(Integer id){
        return _productDetailDAO.findById(id).get();
    }
    @Override
    public DetailProduct insert(DetailProduct p){
        p.setIsDeleted(false);
        p.setId(_productDetailDAO.save(p).getId());
        return p;
    }

    @Override
    public DetailProduct update(DetailProduct p) {
        return _productDetailDAO.save(p);

    }

    @Override
    public void delete(Integer id) {
        _productDetailDAO.deleteAcount(id);
    }
}
