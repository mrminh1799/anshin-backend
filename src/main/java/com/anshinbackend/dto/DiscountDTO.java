package com.anshinbackend.dto;

import com.anshinbackend.entity.Product;
import com.anshinbackend.entity.SaleEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountDTO {
//    Integer id;
//    String discount;
//    Product product;
//    Boolean styleDiscount;
//    SaleEvent saleEvent;

    Integer idDiscount;
    Integer idProduct;
    String productName;
    Integer idSaleEvent;
    String saleName;
    Boolean styleDiscount;
    Integer discount;
    Integer discountPrice;

}
