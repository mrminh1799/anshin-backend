package com.anshinbackend.service.impl;

import com.anshinbackend.dao.ColorDAO;
import com.anshinbackend.dao.ProductDetailDAO;
import com.anshinbackend.dao.SizeDAO;
import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.dto.Customer.ShowImageProdetailDTO;
import com.anshinbackend.dto.Customer.ImageProductDetailDTO;
import com.anshinbackend.dto.Product.ProductDetailInsertResponseDTO;
import com.anshinbackend.dto.ProductDetailDTO;
import com.anshinbackend.entity.Color;
import com.anshinbackend.entity.DetailProduct;
import com.anshinbackend.entity.Product;
import com.anshinbackend.entity.Size;
import com.anshinbackend.service.DetailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DetailProductServiceImpl implements DetailProductService {

    @Autowired
    ProductDetailDAO _productDetailDAO;

    @Autowired
    ColorDAO _colorDAO;

    @Autowired
    SizeDAO _siSizeDAO;

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

    public String findImage(Integer idProduct, Integer idColor) {

        return _productDetailDAO.findImage(idProduct, idColor).getImage();

    }

    @Override
    public List<ShowImageProdetailDTO> findAllImageProductDetailByProduct(Integer idProduct) {
        List<ShowImageProdetailDTO> list= new ArrayList<>();
        _productDetailDAO.findAllImageProductDetailByProduct(idProduct).forEach(x->{
                ShowImageProdetailDTO e = new ShowImageProdetailDTO();
                e.setIdProductDetail(x.getId());
                e.setImageProductDetail(x.getImage());
                list.add(e);

        });
        return list;
    }

    @Override
    public ProductDetailInsertResponseDTO InsertProductDetail(Integer idProduct, Integer idColor, Integer idSize, Integer quantity, String image) {
        Size size = _siSizeDAO.findById(idSize).get();
        Color color = _colorDAO.findById(idColor).get();
        DetailProduct productDetail = new DetailProduct();
        productDetail.setSize(size);
        productDetail.setColor(color);
        productDetail.setQuantity(quantity);
        productDetail.setIsDeleted(false);
        Product product = new Product();
        product.setId(idProduct);
        productDetail.setProduct(product);
        if(image==null) image ="iamge.jpg";
        productDetail.setImage(image);

        DetailProduct detailProduct = _productDetailDAO.save(productDetail);
        ProductDetailInsertResponseDTO dto = new ProductDetailInsertResponseDTO();
        dto.setId(detailProduct.getId());
        dto.setIdColor(detailProduct.getColor().getId());
        dto.setIdSize(detailProduct.getSize().getId());
        dto.setNameColor(detailProduct.getColor().getColorName());
        dto.setNameSize(detailProduct.getSize().getSize_name());
        dto.setQuantity(detailProduct.getQuantity());
        dto.setImage(detailProduct.getImage());
        return dto;




    }
}
