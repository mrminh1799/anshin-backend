package com.anshinbackend.service;
import com.anshinbackend.dto.Customer.ShowImageProdetailDTO;
import com.anshinbackend.dto.Customer.ImageProductDetailDTO;
import com.anshinbackend.dto.Product.ProductDetailInsertResponseDTO;
import com.anshinbackend.dto.Product.ProductDetailUpdateRequestDTO;
import com.anshinbackend.entity.DetailProduct;

import java.util.List;

public interface DetailProductService {

    public List<DetailProduct> findAll();
    public DetailProduct findById(Integer id);
    public DetailProduct insert(DetailProduct p);
    public DetailProduct update(DetailProduct p);
    public  List<DetailProduct> findAllByid(Integer id);
    public void delete(Integer p);
    public DetailProduct findByProductColorSize(Integer idColor, Integer idSize, Integer idProduct);
    public String findImage(Integer idProduct, Integer idColor);
    List<ShowImageProdetailDTO> findAllImageProductDetailByProduct(Integer idProduct);
    public ProductDetailInsertResponseDTO InsertProductDetail(Integer idProduct, Integer  idColor, Integer idSize, Integer quantity, String image);
    public ProductDetailInsertResponseDTO updateProductDetail(ProductDetailUpdateRequestDTO dto);



}
