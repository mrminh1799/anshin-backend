package com.anshinbackend.dto.NavBar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NavBarDTO {
    Integer idCategory;
    String nameCategory;
    List<NavBarChildDTO> listChild;

}
