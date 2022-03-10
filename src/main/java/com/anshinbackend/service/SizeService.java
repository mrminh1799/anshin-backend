package com.anshinbackend.service;

import com.anshinbackend.entity.Size;

import java.util.List;

public interface SizeService {
    public List<Size> findAllByProduct(Integer idProduct);
}
