package com.anshinbackend.controller;

import com.anshinbackend.dao.ProductDAO;
import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.dto.ProductDetailDTO;
import com.anshinbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RequestMapping("/product")
@RestController
public class ProductController {
    @Autowired
    ProductService _productService;

    @Autowired
    ProductDAO repo;

    @GetMapping("/findByPage")
    public ResponseEntity<List<ProductDTO>> findByPage(@RequestParam("currenPage") Integer currenPage,
                                     @RequestParam("sizePage") Integer sizePage){
        return ResponseEntity.ok().body(_productService.findAllPage(currenPage,sizePage));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<ProductDTO>> findALl(){
        return  ResponseEntity.ok().body(_productService.findAll());
    }

    @GetMapping("/findById/{id}")
    public  ResponseEntity<ProductDetailDTO> showProductDetail(@PathVariable("id") Integer id){
        return  ResponseEntity.ok().body(_productService.showDetailProduct(id));
    }
    @GetMapping("/findByTop")
    public  ResponseEntity<List<ProductDTO>> findByTop(
//            @PathVariable("field")Optional<String> field
    ){
//        Sort sort = Sort.by(Sort.Direction.DESC, field.orElse("time_create"));
//        List<ProductDTO> ls = _productService.findByTop(sort);
//        for(ProductDTO productDTO : ls){
//
//        }
        return  ResponseEntity.ok().body(_productService.findByTop());
    }


    @GetMapping("/findBySumTop")
    public  ResponseEntity<List<ProductDTO>> findBySumTop(){
        return  ResponseEntity.ok().body(_productService.findBySumTop());
    }

}
