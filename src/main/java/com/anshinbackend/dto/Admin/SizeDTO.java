package com.anshinbackend.dto.Admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SizeDTO {
    Integer id;
    String size_name;
    Boolean isDelete;
}
