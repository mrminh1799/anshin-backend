package com.anshinbackend.service;

import com.anshinbackend.dto.Admin.AdminDiscountDTO;
import com.anshinbackend.entity.Discount;

import java.util.List;
import java.util.Optional;

public interface DiscountService {

    List<Discount> findAll();

    Optional<Discount> findById(Integer id);

//    List<DiscountDTO> findAllBySaleEven();

    Discount insert(Discount discount);

    Discount update(Discount discount);

    void delete(Integer id);

    public List<AdminDiscountDTO> findByEventId(Integer id);

    public void updateStatusEventForIdEvent(Integer idEvent);

    public void deleteDiscountForId(Integer id);
    public AdminDiscountDTO updateDiscountForId(Integer idDiscount, Boolean styleDiscount, Integer discount);
}
