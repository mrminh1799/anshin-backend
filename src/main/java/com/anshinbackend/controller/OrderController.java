package com.anshinbackend.controller;

import com.anshinbackend.common.constant.OrderStatus;
import com.anshinbackend.dao.AcountDAO;
import com.anshinbackend.dao.ProductDetailDAO;
import com.anshinbackend.dto.Customer.OrderChangeReturnDTO;
import com.anshinbackend.dto.OrderTableForAdmin.OrderDTO;
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

    @Autowired
    AcountDAO _acountDAO;

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
        order.setStatus(OrderStatus.DANG_CHO_XU_LY);

        _orderService.newOrder(order, orderDTO.getIdAcount());


        return  ResponseEntity.ok("Đặt hàng xong hàng xong");

    }


    @PutMapping("/updateOrder/{idOrder}")
    public  ResponseEntity<?> updateOrder(@PathVariable("idOrder") Integer idOrder,@RequestBody OrderDTO orderDTO){
        List<OrderDetail> listOrderDetail = new ArrayList<>();
        orderDTO.getListOrderProductDetailDTO().forEach(x->{
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setDetailProduct(_productDetailDAO.findById(x.getIdProductDetail()).get());
            orderDetail.setQuantity(x.getQuantity());
            listOrderDetail.add(orderDetail);

        });

            Order order = _orderService.findById(idOrder);

            order.setFullName(orderDTO.getFullName());
            order.setAddressDetail(orderDTO.getDetailAddress());
            order.setAddress(orderDTO.getAddress());
            order.setPhoneNumber(orderDTO.getPhoneNumber());
            order.setListOrderDetail(listOrderDetail);



            _orderService.updateOrder(order);


        return  ResponseEntity.ok("Cập nhập thành công");
    }


    @PutMapping("/changeReturn/{idOld}")
    public ResponseEntity<?> newOrder(@PathVariable Integer idOld, @RequestBody OrderChangeReturnDTO orderChangeReturnDTO){



        if(orderChangeReturnDTO.getIdAcount() ==null){
            orderChangeReturnDTO.setIdAcount(5);
        }
        List<OrderDetail> listOrderDetail = new ArrayList<>();
        orderChangeReturnDTO.getListOrderProductDetailDTO().forEach(x->{
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setDetailProduct(_productDetailDAO.findById(x.getIdProductDetail()).get());
            orderDetail.setQuantity(x.getQuantity());
            listOrderDetail.add(orderDetail);

        });


        Order order = new Order();
        order.setReturnOrder(false);
        order.setFullName(orderChangeReturnDTO.getFullName());
        order.setAddressDetail(orderChangeReturnDTO.getDetailAddress());
        order.setAddress(orderChangeReturnDTO.getAddress());
        order.setPhoneNumber(orderChangeReturnDTO.getPhoneNumber());
        order.setListOrderDetail(listOrderDetail);
        order.setStatus(OrderStatus.DANG_CHO_XU_LY);
        order.setAcount(_acountDAO.findById(orderChangeReturnDTO.getIdAcount()).get());



        _orderService.changeReturn(order, idOld, orderChangeReturnDTO.getReason());


        return  ResponseEntity.ok("Đổi hàng thành công");

    }

    @GetMapping("/findByAcountId/{id}")
    public ResponseEntity<?> findByAcountId(@PathVariable("id") Integer id){
        return  ResponseEntity.ok(_orderService.findAllOrderForAcountId(id));

    }


    @GetMapping("/updateStatus/{id}/{status}")
    public ResponseEntity<?> updateStatus(@PathVariable("id")Integer id, @PathVariable("status") Integer status){
        _orderService.updateStatus(id, status);
        return ResponseEntity.ok("Cap nhap status order thanh cong");
    }











}
