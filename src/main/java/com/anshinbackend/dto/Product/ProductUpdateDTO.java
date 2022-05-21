package com.anshinbackend.dto.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductUpdateDTO {
    Integer id;
    String name;
    Integer price;
    Integer idCategory;
    String image;
    String description;
}
