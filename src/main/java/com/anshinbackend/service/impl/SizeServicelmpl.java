package com.anshinbackend.service.impl;

import com.anshinbackend.dao.SizeDAO;
import com.anshinbackend.entity.Size;
import com.anshinbackend.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SizeServicelmpl  implements SizeService {
    @Autowired
    SizeDAO sdao;

    @Override
    public List<Size> findAll() {
        return sdao.findAll();
    }

    @Override
    public Size findById(Integer id) {
        return sdao.findById(id).get();
    }



    public Size create(Size size) {
        return sdao.save(size);
    }

    @Override
    public Size update(Size size) {
        return sdao.save(size);
    }

    @Override
    public void delete(Integer id) {
        sdao.deleteById(id);
    }

}
