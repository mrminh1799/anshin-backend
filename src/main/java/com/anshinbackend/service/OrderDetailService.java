package com.anshinbackend.service;

import com.anshinbackend.dto.OrderTableForAdmin.OrderDetailDTO;
import com.anshinbackend.entity.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetailDTO> finByOrderId(Integer orderId);

    void updateNumberOfProductInOrder(int id_productDetail, int id_Order, int quantity);
}
