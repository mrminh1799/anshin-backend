package com.anshinbackend.dto.Customer;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavoriteDTO {
    Integer IdFavorite;
    Integer IdAcount;
    Integer IdProduct;
    String ProductName;
    Integer PriceProduct;
    String ImageProduct;
}
