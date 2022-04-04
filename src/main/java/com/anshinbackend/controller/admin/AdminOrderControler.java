package com.anshinbackend.controller.admin;

import com.anshinbackend.dto.Admin.AdminOrderDTO;
import com.anshinbackend.entity.Order;
import com.anshinbackend.service.OrderDetailService;
import com.anshinbackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/order")
@CrossOrigin("*")


public class AdminOrderControler {
    @Autowired
    OrderService _orderService;
    @Autowired
    OrderDetailService _orOrderDetailService;

    @GetMapping("/findAll")
    public ResponseEntity<List<AdminOrderDTO>> findAllOrder(){
        return ResponseEntity.ok().body(_orderService.findAllOrder());
    }

    @GetMapping("/findByStatus/{status}")
    public ResponseEntity<List<AdminOrderDTO>> findOrderForStatus(@PathVariable("status") Integer status){
        return ResponseEntity.ok().body(_orderService.findByStatus(status));
    }

    @GetMapping("/findOrderDetailForOrder/{idOrder}")
    public ResponseEntity<?> findOrderDetailForOrder(@PathVariable("idOrder") Integer idOrder){
        return ResponseEntity.ok().body(_orOrderDetailService.finByOrderId(idOrder));
    }

    @GetMapping("/findByOrderByStatusAndSort")
    public ResponseEntity<List<Order>> findByOrderByStatusAndSort(){
        return ResponseEntity.ok().body(_orderService.findByOrderByStatusAndSort());
    }

}
