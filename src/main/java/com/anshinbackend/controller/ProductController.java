package com.anshinbackend.controller;

import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping("/product")
@RestController
public class ProductController {
    @Autowired
    ProductService _productService;
    @GetMapping("/findByPage")
    public ResponseEntity<List<ProductDTO>> findByPage(@RequestParam("currenPage") Integer currenPage,
                                     @RequestParam("sizePage") Integer sizePage){
        return ResponseEntity.ok().body(_productService.findAllPage(currenPage,sizePage));
    }


}
