package com.anshinbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColorDTO {
    Integer idColor;
    String  nameColor;
    Boolean isSelected;

}
