package com.anshinbackend.service;

import com.anshinbackend.entity.Size;

import java.util.List;

public interface SizeService {
    public List<Size> findAll();

    Size findById(Integer id);

    Size create(Size size);

    Size update(Size size);

    void delete(Integer id);
    }

