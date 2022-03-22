package com.anshinbackend.controller;

import com.anshinbackend.dao.ProductDAO;
import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.dto.ProductDetailDTO;
import com.anshinbackend.entity.Product;
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



    @GetMapping("/findAllByIdCategory/{cid}")
    public  ResponseEntity<List<ProductDTO>> findAllByIdCate(@PathVariable("cid") Integer id){
        return  ResponseEntity.ok().body((_productService.findAllByIdCategory(id)));
    }

    @GetMapping("/findAllByNameCategory/{cid}")
    public ResponseEntity<List<ProductDTO>> findAllByNameCate(@PathVariable("cid") String name) {
        return ResponseEntity.ok().body((_productService.findAllByNameCategory(name)));
    }
    @GetMapping("/findBySumTop")
    public  ResponseEntity<List<ProductDTO>> findBySumTop(){
        return  ResponseEntity.ok().body(_productService.findBySumTop());

    }

    @GetMapping("/findByColorSizePrice/{id_color}/{id_size}/{top_price}/{bottom_price}")
    public ResponseEntity<List<?>> findByColorSizePrice(@PathVariable("id_color") Integer idColor,@PathVariable("id_size") Integer idSize
            ,@PathVariable("top_price") Integer topPrice,@PathVariable("bottom_price") Integer bottomPrice){
        return  ResponseEntity.ok(_productService.findByColorSizePrice(idColor, idSize, topPrice, bottomPrice));
    }
}
