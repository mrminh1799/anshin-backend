package com.anshinbackend.dto.Customer;

import com.anshinbackend.entity.DetailProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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