package com.anshinbackend.service;


import com.anshinbackend.entity.Favorie;

import java.util.List;

public interface FavorieService {
    public List<Favorie> findAll();

    Favorie findById(Integer id);

    Favorie create(Favorie favorie);

    Favorie update(Favorie favorie);

    void delete(Integer id);
}
