package com.anshinbackend.controller;

import com.anshinbackend.common.constant.OrderStatus;
import com.anshinbackend.dao.AcountDAO;
import com.anshinbackend.dao.OrderDAO;
import com.anshinbackend.dao.ProductDetailDAO;
import com.anshinbackend.dto.Customer.OrderChangeReturnDTO;
import com.anshinbackend.dto.OrderTableForAdmin.OrderDTO;
import com.anshinbackend.dto.OrderTableForAdmin.OrderDetailDTO;
import com.anshinbackend.entity.Order;
import com.anshinbackend.entity.OrderDetail;
import com.anshinbackend.service.OrderService;
import com.anshinbackend.service.UserPDFExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


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

    @Autowired
    OrderDAO _orderDAO;

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
    public ResponseEntity<?> changerReturn(@PathVariable Integer idOld, @RequestBody OrderChangeReturnDTO orderChangeReturnDTO){

        orderChangeReturnDTO.getListOrderProductDetailDTO().forEach(x->{
            System.out.println((x.getIdProductDetail()));
            System.out.println((x.getQuantity()));
        });

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

    @GetMapping("/findListOrderDetailForOrderId/{id}")
    public ResponseEntity<?> findByOrderId(@PathVariable("id") Integer id){

        return ResponseEntity.ok(_orderService.findByOrderId(id));
    }

    @GetMapping("/updateQuanityForOrderDetail/{id}/{quantity}")
    public ResponseEntity<?> updatteQuantityForOrderDetai(@PathVariable("id") Integer id, @PathVariable("quantity") Integer quantity){
        _orderService.updateQuantity(id, quantity);
        return   ResponseEntity.ok("Thay do so luong thanh cong");
    }

    @GetMapping("/deleteOrderDetailById/{id}")
    public ResponseEntity<?> updatteQuantityForOrderDetai(@PathVariable("id") Integer id){
        _orderService.deleteOrderDetail(id);
        return   ResponseEntity.ok("Xoa order detail thanh cong");
    }

    @PostMapping("/createOrderDetail")
    public ResponseEntity<?> createOrderDetail(@RequestBody Map map){


        Integer idOrder = Integer.parseInt(map.get("idOrder").toString());
        Integer idProductDetail = Integer.parseInt(map.get("idProduct").toString());
        Integer quantity = Integer.parseInt(map.get("quantity").toString());
        return  ResponseEntity.ok(_orderService.insertOrderDetail(idOrder, idProductDetail, quantity));

    }

    @PutMapping("/updateInfomatinCustomer/{idOrder}")
    public ResponseEntity<?> updateInfomationCustomer(@PathVariable("idOrder") Integer idOrder, @RequestBody Map map){
        String fullName= map.get("fullName").toString();
        String address = map.get("address").toString();
        String phoneNumber =map.get("phoneNumber").toString();
        _orderService.updateInfomatinCustomer(idOrder, fullName, address, phoneNumber);
        return ResponseEntity.ok("Doi thong tin thanh cong");

    }


    @GetMapping("/createNewOrderForAdmin/{name}")
    public ResponseEntity<?> createNewOrderForAdmin(@PathVariable("name") String name){
       return  ResponseEntity.ok(_orderService.createNewOrderForAdmin(name));
    }

    @DeleteMapping("/deleteTransaction/{id}")
    public ResponseEntity<?> deleteTransaction(@PathVariable("id") Integer id){
        _orderService.deleteOrderTransaction(id);
        return  ResponseEntity.ok("Xóa thành công");
    }

    @GetMapping("/exportToPDS/{id}")
    public  void expordtOrderToPDD(HttpServletResponse response, @PathVariable("id") Integer idOrder) {
        Order order = _orderDAO.findById(idOrder).get();
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename="+order.getId() + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);


        UserPDFExporter exporter = new UserPDFExporter(order);
        try {
            exporter.export(response);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @GetMapping("/getHistoryOrder/{id}")
    public ResponseEntity<List<OrderDetailDTO>> getHistory(@PathVariable("id") Integer id){
        return  ResponseEntity.ok(_orderService.findHistory(id));
    }


}
