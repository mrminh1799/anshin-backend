package com.anshinbackend.service.impl;

import com.anshinbackend.dao.DiscountDAO;
import com.anshinbackend.entity.Discount;
import com.anshinbackend.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DiscountServiceImpl implements DiscountService {
    @Autowired
    DiscountDAO ddao;

    @Override
    public List<Discount> findAll() {
        return ddao.findAll();
    }

    @Override
    public Discount findById(Integer id) {
        return ddao.findById(id).get();
    }



    public Discount create(Discount discount) {
        return ddao.save(discount);
    }

    @Override
    public Discount update(Discount discount) {
        return ddao.save(discount);
    }

    @Override
    public void delete(Integer id) {
        ddao.deleteById(id);
    }
}
