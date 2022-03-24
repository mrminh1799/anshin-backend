package com.anshinbackend.service;

import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.dto.DiscountDTO;
import com.anshinbackend.dto.ProductDetailDTO;
import com.anshinbackend.entity.Product;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ProductService extends GenericService<Product, Integer> {
    public List<ProductDTO> findAll();
    public Product findById(Integer id);
    public Product inset(Product p);
    public Product update(Product p);
    public Integer delete(Integer id);
    public List<ProductDTO> findByTop(
//            Sort sort
    );
    public List<ProductDTO> findBySumTop();
    public List<ProductDTO> findAllPage(Integer currentPage, Integer sizePage);
    public ProductDetailDTO showDetailProduct(Integer id);


    public List<ProductDTO> findAllByIdCategory(Integer id);
    public List<ProductDTO> findAllByNameCategory(String name);

    List<ProductDTO> findByColorSizePrice(Integer idColor, Integer idSize, Integer topPrice, Integer bottomPrice);

    List<ProductDTO> findAllBySaleEvent();
}
