package com.anshinbackend.dto.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    Integer id;
    String name;
    Integer price;
    String image;
    Integer status;
    String description;


    //List<DetailProduct> listDetailProduct;


}
