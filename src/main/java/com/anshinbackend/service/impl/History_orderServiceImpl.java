package com.anshinbackend.service.impl;

import com.anshinbackend.dao.DiscountDAO;
import com.anshinbackend.dao.History_orderDAO;
import com.anshinbackend.entity.Discount;
import com.anshinbackend.entity.History_order;
import com.anshinbackend.service.History_orderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class History_orderServiceImpl implements History_orderService {
    @Autowired
    History_orderDAO Hdao;

    @Override
    public List<History_order> findAll() {
        return Hdao.findAll();
    }

    @Override
    public History_order findById(Integer id) {
        return Hdao.findById(id).get();
    }



    public History_order create(History_order hstry_order) {
        return Hdao.save(hstry_order);
    }

    @Override
    public History_order update(History_order hstry_order) {
        return Hdao.save(hstry_order);
    }

    @Override
    public void delete(Integer id) {
        Hdao.deleteById(id);
    }
}
