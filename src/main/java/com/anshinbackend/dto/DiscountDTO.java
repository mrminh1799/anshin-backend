package com.anshinbackend.dto;

import com.anshinbackend.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountDTO {
    Integer id;
    List<Product> product;

}
