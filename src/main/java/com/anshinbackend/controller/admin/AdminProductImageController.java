package com.anshinbackend.controller.admin;

import com.anshinbackend.entity.ProductImage;
import com.anshinbackend.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/productImage")
public class AdminProductImageController {
    @Autowired
    ProductImageService _productImageService;
    @GetMapping("/findAll")
    public ResponseEntity<List<ProductImage>> findAll(){
        return  ResponseEntity.ok().body(_productImageService.findAll());
    }
//    @GetMapping("/findByProductDetailId/{id}")
//    public ResponseEntity<List<ProductImage>> findByProducDetailId(@PathVariable ("id") Integer id){
//        return  ResponseEntity.ok().body(_productImageService.findByProductDetai(id));
//    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        _productImageService.delete(id);
        return ResponseEntity.ok().body(null);
    }

}
