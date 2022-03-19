package com.anshinbackend.service.impl;

import com.anshinbackend.dao.FavoriteDAO;
import com.anshinbackend.entity.Favorite;
import com.anshinbackend.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Autowired
    FavoriteDAO fDAO;

    @Override
    public List<Favorite> findByAccountId(Integer aid) {
        return fDAO.findByAccountId(aid);
    }

    @Override
    public Optional<Favorite> findByProductId(Integer pid) {
        return fDAO.findByProductId(pid);
    }
}
