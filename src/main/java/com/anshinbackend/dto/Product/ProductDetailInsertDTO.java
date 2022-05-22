package com.anshinbackend.dto.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailInsertDTO {
    Integer idProduct;
    Integer idColor;
    Integer idSize;
    Integer quantity;
    String image;
}
