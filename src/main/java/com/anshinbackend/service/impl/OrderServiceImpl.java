package com.anshinbackend.service.impl;

import com.anshinbackend.dao.*;
import com.anshinbackend.entity.Acount;
import com.anshinbackend.entity.DetailProduct;
import com.anshinbackend.entity.Order;
import com.anshinbackend.entity.OrderDetail;
import com.anshinbackend.service.DetailProductService;
import com.anshinbackend.service.OrderDetailService;
import com.anshinbackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.logging.SimpleFormatter;

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
        order.setTime_create(new Date());

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
}
