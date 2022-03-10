package com.anshinbackend.dto.NavBar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDetailDTO {
    Integer idProduct;
    String productName;
    String sizeName;
    String colorName;
    String colorImage;
    Integer price;


}
