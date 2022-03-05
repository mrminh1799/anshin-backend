package com.anshinbackend.controller.admin;

import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.entity.Product;
import com.anshinbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin/product")
@CrossOrigin("*")
public class AdminProductController {
    @Autowired
    ProductService _productProductService;
    @GetMapping("/findAll")
    public ResponseEntity<List<ProductDTO>> findAll(){
        return  ResponseEntity.ok(_productProductService.findAll());
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") Integer id){
        return  ResponseEntity.ok(_productProductService.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Product> insert(@RequestBody Product p){
        return  ResponseEntity.ok(_productProductService.inset(p));
    }

    @PutMapping("/update")
    public ResponseEntity<Product> update(@RequestBody Product p){
        return  ResponseEntity.ok(_productProductService.update(p));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Product> delete(@PathVariable("id") Integer id){
        _productProductService.delete(id);
        return  ResponseEntity.ok(null);
    }



}
