package com.anshinbackend.service.impl;

import com.anshinbackend.dao.ProductDetailDAO;
import com.anshinbackend.dto.Customer.ImageProductDetailDTO;
import com.anshinbackend.dto.ProductDetailDTO;
import com.anshinbackend.entity.DetailProduct;
import com.anshinbackend.service.DetailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<DetailProduct> findAllByid(Integer id) {
        return _productDetailDAO.findAllByid(id);
    }

    @Override
    public void delete(Integer id) {
        _productDetailDAO.softDelete(id);
    }

    @Override
    public DetailProduct findByProductColorSize(Integer idColor, Integer idSize, Integer idProduct) {
        return _productDetailDAO.findByColorSizeProduct(idColor, idSize, idProduct);
    }

    @Override

    public List<ImageProductDetailDTO> findAllImageProductDetailByProduct(Integer id) {
        List<ImageProductDetailDTO> list= new ArrayList<>();
        _productDetailDAO.findAllImageProductDetailByProduct(id).forEach(x->{
            ImageProductDetailDTO e = new ImageProductDetailDTO();
            e.setIdProductDetail(x.getId());
            e.setImageProDetail(x.getImage());
            list.add(e);
        });
        return list;
}
    public String findImage(Integer idProduct, Integer idColor) {

        return _productDetailDAO.findImage(idProduct, idColor).getImage();

    }
}
