package com.anshinbackend.service;

import com.anshinbackend.entity.Size;

import java.util.List;
import java.util.Optional;

public interface SizeService {
    public List<Size> findAllByProduct(Integer idProduct);
    List<Size> findAll();

    Optional<Size> findById(Integer id);

    Size create(Size size);

    Size update(Size size);

    Integer delete(Integer id);

    List<Size> findByIsdeleteSize();


}
