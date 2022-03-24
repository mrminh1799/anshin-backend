package com.anshinbackend.dto.Admin;


import com.anshinbackend.dto.NavBar.NavBarChildDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriDTO {
    Integer idCategory;
    String nameCategory;
    List<NavBarChildDTO> listChild;
//    Integer id;
//    String name;
//    String nameCha;

}
