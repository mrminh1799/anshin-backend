package com.anshinbackend.controller;

import com.anshinbackend.entity.CartItem;
import com.anshinbackend.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin("*")

public class CartController {
    @Autowired
    CartItemService _cartItemService;
    @GetMapping("/findAll")
    public ResponseEntity<List<CartItem>> findAll(){
        return  ResponseEntity.ok(_cartItemService.findAll());
    }
}
