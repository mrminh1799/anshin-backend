package com.anshinbackend.controller;

import com.anshinbackend.dto.Admin.CategoriDTO;
import com.anshinbackend.dto.NavBar.NavBarDTO;
import com.anshinbackend.entity.Category;
import com.anshinbackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Category")
@CrossOrigin("*")
public class CategoryController {
@Autowired
    CategoryService _categoryService;

    @GetMapping("/getNavBar")
    public ResponseEntity<List<NavBarDTO>> getNavBar(){
        return ResponseEntity.ok(_categoryService.findForNavBar());
    }


    @GetMapping("/findByCon")
    public  ResponseEntity<?> findByCon(){
        return  ResponseEntity.ok().body(_categoryService.findByCon());
    }

    @GetMapping("/findAllBacon/{id}")
    public  ResponseEntity<List<CategoriDTO>> findForNavbar1(
//            @PathVariable("fid")Integer fid,
            @PathVariable("id")Integer id){
        return  ResponseEntity.ok().body(_categoryService.findForNavbar1(id));
    }
}
