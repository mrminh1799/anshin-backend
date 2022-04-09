package com.anshinbackend.service;

import com.anshinbackend.dto.DiscountDTO;
import com.anshinbackend.entity.Discount;

import java.util.List;
import java.util.Optional;

public interface DiscountService {

    List<Discount> findAll();

    Optional<Discount> findById(Integer id);

//    List<DiscountDTO> findAllBySaleEven();

    DiscountDTO insert(Discount discount);

    Discount update(Discount discount);

    void delete(Integer id);
}
