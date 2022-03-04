package com.anshinbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderProductDetailDTO {
    Integer idProductDetail;
    Integer quantity;
}
