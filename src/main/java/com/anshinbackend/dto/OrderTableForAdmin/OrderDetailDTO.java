package com.anshinbackend.dto.OrderTableForAdmin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetailDTO {
    Integer idOrderDetail;
    String nameProduct;
    String coloName;
    String sizeName;
    Integer quantity;
    Integer price;
    Integer sumPrice;

}
