package com.anshinbackend.dto.Customer;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.sql.In;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsssDTO {

    Integer id;
    String name;
    Integer price;
    String image;
    String description;
    Boolean StyleDiscount;
    Integer discountPrice;
}
