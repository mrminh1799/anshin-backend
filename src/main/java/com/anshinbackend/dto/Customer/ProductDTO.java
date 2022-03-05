package com.anshinbackend.dto.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    Integer id;
    String name;
    Integer price;
    String image;
    String description;
    //List<DetailProduct> listDetailProduct;


}
