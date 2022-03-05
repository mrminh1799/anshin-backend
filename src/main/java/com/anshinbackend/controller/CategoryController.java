package com.anshinbackend.controller;

import com.anshinbackend.dto.NavBar.NavBarDTO;
import com.anshinbackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Category")
public class CategoryController {
@Autowired
    CategoryService _categoryService;

    @GetMapping("/getNavBar")
    public ResponseEntity<List<NavBarDTO>> getNavBar(){
        return ResponseEntity.ok(_categoryService.findForNavBar());
    }
}
