package com.anshinbackend.service;

import com.anshinbackend.entity.Favorie;
import com.anshinbackend.entity.History_order;

import java.util.List;

public interface History_orderService {
    public List<History_order> findAll();

    History_order findById(Integer id);

    History_order create(History_order hstry_order);

    History_order update(History_order hstry_order);

    void delete(Integer id);
}
