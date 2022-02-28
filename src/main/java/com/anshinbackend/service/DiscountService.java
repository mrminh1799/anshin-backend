package com.anshinbackend.service;

import com.anshinbackend.entity.Discount;


import java.util.List;

public interface DiscountService {
    public List<Discount> findAll();

    Discount findById(Integer id);

    Discount create(Discount discount);

    Discount update(Discount discount);

    void delete(Integer id);
}
