package com.anshinbackend.controller.admin;

import com.anshinbackend.dto.Admin.AdminOrderDTO;
import com.anshinbackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/order")
@CrossOrigin("*")


public class AdminOrderControler {
    @Autowired
    OrderService _orderService;
    @GetMapping("/findAll")
    public ResponseEntity<List<AdminOrderDTO>> findAllOrder(){
        return ResponseEntity.ok().body(_orderService.findAllOrder());
    }

}
