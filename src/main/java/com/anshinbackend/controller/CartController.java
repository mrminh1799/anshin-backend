package com.anshinbackend.controller;

import com.anshinbackend.dto.CartItemDTO;
import com.anshinbackend.dto.NavBar.CartDetailDTO;
import com.anshinbackend.entity.CartItem;
import com.anshinbackend.entity.DetailProduct;
import com.anshinbackend.service.CartItemService;
import com.anshinbackend.service.DetailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cart")
@CrossOrigin("*")

public class CartController {
    @Autowired
    CartItemService _cartItemService;

    @Autowired
    DetailProductService _detailProductService;
    @GetMapping("/findAll")
    public ResponseEntity<List<CartItem>> findAll(){
        return  ResponseEntity.ok(_cartItemService.findAll());
    }

    @GetMapping("/findByIdAcount/{id}")
    public ResponseEntity<?> findByIDAcount(@PathVariable("id") Integer id){
        return  ResponseEntity.ok(_cartItemService.findByAccountId(id));
    }

    @GetMapping("/findDetailCartItem/{idProductDetail}")
    public ResponseEntity<?> findProductDetaiForCart(@PathVariable("idProductDetail") Integer id){
        DetailProduct p =  _detailProductService.findById(id);
        CartDetailDTO c = new CartDetailDTO();
        c.setIdProduct(p.getId());
        c.setProductName(p.getProduct().getProductName());
        c.setColorImage(p.getImage());
        c.setColorName(p.getColor().getColorName());
        c.setSizeName(p.getSize().getSize_name());
        c.setPrice(p.getProduct().getPrice());
        return  ResponseEntity.ok(c);
    }

}
