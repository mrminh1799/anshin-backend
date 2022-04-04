package com.anshinbackend.dto.Admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColorDTO {
    Integer id;
    String colorName;
    Boolean isDelete;
}
