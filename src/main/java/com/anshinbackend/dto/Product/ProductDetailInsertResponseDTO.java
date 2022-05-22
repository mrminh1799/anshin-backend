package com.anshinbackend.dto.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailInsertResponseDTO {
    Integer id;
    Integer idColor;
    Integer idSize;
    String image;
    String nameColor;
    String nameSize;
    Integer quantity;

}
