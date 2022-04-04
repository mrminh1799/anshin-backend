package com.anshinbackend.service;

import com.anshinbackend.dto.Admin.AdminOrderDTO;
import com.anshinbackend.dto.Customer.OrderDTO;
import com.anshinbackend.dto.OrderTableForAdmin.OrderDetailDTO;
import com.anshinbackend.dto.ProductDetailDTO;
import com.anshinbackend.entity.Order;

import java.util.List;

public interface OrderService {
    public void newOrder(Order order, Integer id);
    public void updateOrder(Order order);
    public List<AdminOrderDTO> findAllOrder();
    public List<AdminOrderDTO> findByStatus(Integer status);
    public Order findById(Integer id);
    public  void changeReturn(Order order, Integer orderIdOld, String reason);

    public List<OrderDTO> findAllOrderForAcountId(Integer idAcount);
    public void updateStatus(Integer id, Integer status);
    public List<OrderDetailDTO> findByOrderId(Integer orderId);
    public void updateQuantity(Integer idOrderDetail, Integer quantity);
    public void deleteOrderDetail(Integer idOrderDetailId);

    List<Order> findByOrderByStatusAndSort();
}
