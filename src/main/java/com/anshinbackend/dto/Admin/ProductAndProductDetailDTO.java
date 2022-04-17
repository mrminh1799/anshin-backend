package com.anshinbackend.dto.Admin;

import lombok.Data;

import java.util.List;

@Data
public class ProductAndProductDetailDTO {
    Integer id;
    String  name;
    String image;
    Integer price;
    Integer categoryId;
    String description;
    List<ProductDetailDTO> listDetail;

}
