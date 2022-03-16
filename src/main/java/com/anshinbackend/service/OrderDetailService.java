package com.anshinbackend.service;

import com.anshinbackend.dto.OrderTableForAdmin.OrderDetailDTO;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetailDTO> finByOrderId(Integer orderId);

}
