package com.anshinbackend.dto;

import com.anshinbackend.entity.DetailProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailDTO {
    Integer id;
    String name;
    Integer price;
    String image;
    Integer categoryId;
    String categoryName;
    String description;
    List<DetailProduct> listDetailProduct;
    List<ColorDTO> listColor;
    List<SizeDTO> listSize;
}
