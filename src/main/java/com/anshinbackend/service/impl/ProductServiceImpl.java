package com.anshinbackend.service.impl;

import com.anshinbackend.dao.ProductDAO;
import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.dto.ProductDetailDTO;
import com.anshinbackend.entity.Product;
import com.anshinbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServiceImpl  implements ProductService {
    @Autowired
    ProductDAO _productDAO;

    @Override
    public List<ProductDTO> findAll() {

        List<ProductDTO> list= new ArrayList<>();
        _productDAO.findByIsDeleteIsFalse().forEach(x->{
            ProductDTO e = new ProductDTO();
            e.setId(x.getId());
            e.setName(x.getProductName());
            e.setImage(x.getImage());
            try {
                e.setPrice(x.getListProductDetails().get(0).getExportPrice());
            }catch (IndexOutOfBoundsException exception){
                e.setPrice(0);
            }
            e.setDescription(x.getDescription());
            list.add(e);
        });
        return list;
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

    @Override
    public List<ProductDTO> findAllPage(Integer currentPage, Integer sizePage) {

        Pageable page = PageRequest.of(currentPage, sizePage);
        List<ProductDTO> list= new ArrayList<>();
        _productDAO.findByIsDeleteIsFalse(page).forEach(x->{
            ProductDTO e = new ProductDTO();
            e.setId(x.getId());
            e.setName(x.getProductName());
            e.setImage(x.getImage());
            try {
                e.setPrice(x.getListProductDetails().get(0).getExportPrice());
            }catch (IndexOutOfBoundsException exception){
                e.setPrice(0);
            }
            e.setDescription(x.getDescription());
            list.add(e);
        });
        return list;
    }

    @Override
    public ProductDetailDTO showDetailProduct(Integer id) {
        Product p =_productDAO.findById(id).get();

        ProductDetailDTO dto = new ProductDetailDTO();
        dto.setId(p.getId());
        dto.setName(p.getProductName());
        dto.setImage(p.getImage());
        try {
            dto.setPrice(p.getListProductDetails().get(0).getExportPrice());
        }catch (IndexOutOfBoundsException exception){
            dto.setPrice(0);
        }
        dto.setListDetailProduct(p.getListProductDetails());
        dto.setDescription(p.getDescription());
        return  dto;

    }


}
