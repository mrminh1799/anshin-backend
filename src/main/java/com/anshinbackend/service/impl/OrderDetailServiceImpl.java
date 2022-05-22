package com.anshinbackend.service.impl;

import com.anshinbackend.dao.OrderDetailDAO;
import com.anshinbackend.dto.OrderTableForAdmin.OrderDetailDTO;
import com.anshinbackend.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
@Autowired
    OrderDetailDAO _OrdetailDAO;

    @Override
    public List<OrderDetailDTO> finByOrderId(Integer orderId) {
        List<OrderDetailDTO> list = new ArrayList<>();

        _OrdetailDAO.findByOrderId(orderId).forEach(x->{
            list.add(new OrderDetailDTO(x.getId(),x.getDetailProduct().getId(), x.getDetailProduct().getProduct().getProductName(),
                    x.getDetailProduct().getColor().getColorName(),
                    x.getDetailProduct().getSize().getSize_name(),
                    x.getQuantity(),
                    x.getPrice(),
                    x.getPrice()* x.getQuantity()
                    ));
        });
        return list;
    }
}
