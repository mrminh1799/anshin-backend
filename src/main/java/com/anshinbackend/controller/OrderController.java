package com.anshinbackend.controller;

import com.anshinbackend.common.constant.OrderStatus;
import com.anshinbackend.dao.ProductDetailDAO;
import com.anshinbackend.dto.OrderDTO;
import com.anshinbackend.entity.Order;
import com.anshinbackend.entity.OrderDetail;
import com.anshinbackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/Order")
@CrossOrigin("*")
public class OrderController {
    @Autowired
    ProductDetailDAO _productDetailDAO;

    @Autowired
    OrderService _orderService;

    @PostMapping("/newOrder")
    public ResponseEntity<?> newOrder(@RequestBody OrderDTO orderDTO){
        if(orderDTO.getIdAcount() ==null){
            orderDTO.setIdAcount(5);
        }
        List<OrderDetail> listOrderDetail = new ArrayList<>();
        orderDTO.getListOrderProductDetailDTO().forEach(x->{
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setDetailProduct(_productDetailDAO.findById(x.getIdProductDetail()).get());
            orderDetail.setQuantity(x.getQuantity());
            listOrderDetail.add(orderDetail);

        });


        Order order = new Order();
        order.setReturnOrder(false);
        order.setFullName(orderDTO.getFullName());
        order.setAddressDetail(orderDTO.getDetailAddress());
        order.setAddress(orderDTO.getAddress());
        order.setPhoneNumber(orderDTO.getPhoneNumber());
        order.setListOrderDetail(listOrderDetail);
        order.setStatus(OrderStatus.DANG_XU_LY);

        _orderService.newOrder(order, orderDTO.getIdAcount());


        return  ResponseEntity.ok("Đặt hàng xong hàng xong");

    }

}
