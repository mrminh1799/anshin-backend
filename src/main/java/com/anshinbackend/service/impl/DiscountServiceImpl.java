package com.anshinbackend.service.impl;

import com.anshinbackend.dao.DiscountDAO;
import com.anshinbackend.entity.Discount;
import com.anshinbackend.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DiscountServiceImpl  implements DiscountService {
    @Autowired
    DiscountDAO _ddao;

    @Override
    public List<Discount> findAll() {
        return _ddao.findAll();
    }

    @Override
    public Optional<Discount> findById(Integer id) {
        return _ddao.findById(id);
    }

    @Override
    public List<Discount> findAllBySaleEven(Date year) {
        return _ddao.findAllBySaleEvent(year);
    }


    @Override
    public Discount insert(Discount discount) {
        Integer id = _ddao.save(discount).getId();
        discount.setId(id);
        return discount;
    }

    @Override
    public Discount update(Discount discount) {
        return _ddao.save(discount);
    }

    @Override
    public void delete(Integer id) {
        _ddao.deleteById(id);
    }
}
