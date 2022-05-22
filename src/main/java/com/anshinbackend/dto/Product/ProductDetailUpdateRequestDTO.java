package com.anshinbackend.dto.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailUpdateRequestDTO {
    Integer id;
    Integer quantity;
    String image;
}
