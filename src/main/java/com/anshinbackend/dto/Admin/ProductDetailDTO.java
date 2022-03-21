package com.anshinbackend.dto.Admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductDetailDTO {

    Integer quantity;
    Integer idProduct;
    Integer idSize;
    Integer idColor;
    String image;
}
