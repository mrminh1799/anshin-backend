package com.anshinbackend.controller.admin;

import com.anshinbackend.entity.OrderDetail;
import com.anshinbackend.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/orderDetail")
public class AdminOrderDetailController {
    @Autowired
    OrderDetailService orderDetailService;

    @PutMapping("/updateNumberOfProductInOrder/{id_product_detail}/{id_order}/{quantity}")
    public ResponseEntity updateNumberOfProductInOrder(@PathVariable("id_product_detail") int idProductDetail,
                                                                    @PathVariable("id_order") int idOrder,
                                                                    @PathVariable("quantity") int quantity){
         orderDetailService.updateNumberOfProductInOrder(idProductDetail,idOrder,quantity);
         return ResponseEntity.ok().body(null);
    }

}
