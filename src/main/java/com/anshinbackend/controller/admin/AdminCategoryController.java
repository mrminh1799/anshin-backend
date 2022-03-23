package com.anshinbackend.controller.admin;

import com.anshinbackend.dto.Admin.CategoryDTO;
import com.anshinbackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Admin/Category")
@CrossOrigin("*")
public class AdminCategoryController {
    @Autowired
    CategoryService _categoryService;

    @GetMapping("/findAllByCategoryParentId")
    public ResponseEntity<List<CategoryDTO>> findAllByCategoryParentId(){
        return ResponseEntity.ok().body(_categoryService.findAllByCategoryParentId());
    }
}
