package com.anshinbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColorProductDetailDTO {
    Integer id;
    String color_name;
    String image;
}
