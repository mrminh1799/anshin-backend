package com.anshinbackend.dto.Admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDiscountDTO {
    Integer idDiscount;
    Integer idProduct;
    String productName;
    Boolean styleDiscount;
    Integer discount;
    Integer discountPrice;
}
