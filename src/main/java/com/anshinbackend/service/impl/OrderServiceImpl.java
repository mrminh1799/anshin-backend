package com.anshinbackend.service.impl;

import com.anshinbackend.dao.*;
import com.anshinbackend.dto.Admin.AdminOrderDTO;
import com.anshinbackend.entity.Acount;
import com.anshinbackend.entity.DetailProduct;
import com.anshinbackend.entity.Order;
import com.anshinbackend.entity.OrderDetail;
import com.anshinbackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDAO _orderDAO;
    @Autowired
    AcountDAO _acountDAO;

    @Autowired
    OrderDetailDAO _orderDetailDAO;

    @Autowired
    ProductDetailDAO _productDetailDAO;

    @Override
    public void newOrder(Order order, Integer idAcount) {
        order.setTimeCreate(new Date());

        Acount acount = _acountDAO.findById(idAcount).get();
        order.setAcount(acount);
        Integer orderId = _orderDAO.save(order).getId();
        order.setId(orderId);
        System.out.println(order.getListOrderDetail().get(0).getQuantity());
        order.getListOrderDetail().forEach(x->{

            DetailProduct detailProduct= _productDetailDAO.findById(x.getDetailProduct().getId()).get();

            OrderDetail detailOrder = x;

            if(detailProduct.getQuantity()<detailOrder.getQuantity()){
                try {
                    throw new Exception("Order false");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                Integer productLeft = detailProduct.getQuantity() - detailOrder.getQuantity();
                detailProduct.setQuantity(productLeft);
                _productDetailDAO.save(detailProduct);

                detailOrder.setPrice(detailProduct.getExportPrice());
                detailOrder.setOrder(order);
                detailOrder.setDetailProduct(detailProduct);
                _orderDetailDAO.save(detailOrder);
            }

        });




    }

    @Override
    public List<AdminOrderDTO> findAllOrder() {

        List<AdminOrderDTO> list = new ArrayList<>();
         _orderDAO.findByReturnOrderIsFalseOrderByTimeCreateDesc ().forEach(x->{
             AdminOrderDTO  dto = new AdminOrderDTO() ;
             dto.setId(x.getId());
             dto.setAddress(x.getAddress());
             dto.setDetailAddress(x.getAddressDetail());
             dto.setFullName(x.getFullName());
             dto.setStatus(x.getStatus());
             dto.setIdAcount(x.getAcount().getId());
             dto.setIdStaff(x.getStaffId());
             dto.setPhoneNumber(x.getPhoneNumber());
             AtomicReference<Integer> sum = new AtomicReference<>(0);
             _orderDetailDAO.findByOrder(x).forEach(y->
             {
                 Integer quantity=0;
                 Integer price =0;
                 try {
                     quantity = y.getQuantity();
                     if(quantity==null){
                         quantity=0;
                     }
                 }catch (NullPointerException ex){
                     quantity=0;
                 }

                 try {
                     price = y.getPrice();
                     if(price==null){
                         price=0;
                     }
                 }catch (NullPointerException ex){
                     price = 0;
                 }
                 sum.set(quantity * price);
             });

             dto.setSumPrice(sum.get());
             dto.setTimeCreate(x.getTimeCreate());
             list.add(dto);

         });

         return  list;
    }
}
