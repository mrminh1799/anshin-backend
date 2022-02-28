package com.anshinbackend.service.impl;


import com.anshinbackend.dao.FavorieDAO;
import com.anshinbackend.entity.Discount;
import com.anshinbackend.entity.Favorie;
import com.anshinbackend.service.FavorieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FavorieServiceImpl implements FavorieService {
    @Autowired
    FavorieDAO Fdao;

    @Override
    public List<Favorie> findAll() {
        return Fdao.findAll();
    }

    @Override
    public Favorie findById(Integer id) {
        return Fdao.findById(id).get();
    }



    public Favorie create(Favorie favorie) {
        return Fdao.save(favorie);
    }

    @Override
    public Favorie update(Favorie favorie) {
        return Fdao.save(favorie);
    }

    @Override
    public void delete(Integer id) {
        Fdao.deleteById(id);
    }
}
