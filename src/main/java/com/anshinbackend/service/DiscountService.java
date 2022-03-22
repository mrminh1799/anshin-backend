package com.anshinbackend.service;

import com.anshinbackend.entity.Discount;
import com.anshinbackend.entity.Size;
import org.springframework.data.relational.core.sql.In;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface DiscountService {

    List<Discount> findAll();

    Optional<Discount> findById(Integer id);

    List<Discount> findAllBySaleEven(Date year);

    Discount insert(Discount discount);

    Discount update(Discount discount);

    void delete(Integer id);
}
