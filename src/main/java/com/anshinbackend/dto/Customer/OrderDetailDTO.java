package com.anshinbackend.dto.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailDTO {
    Integer idProduct;
    Integer colorId;
    String colorName;

    Integer sizeId;
    String sizeName;
    Integer quantity;
    String sumPrice;


}
