package com.anshinbackend.service;

import com.anshinbackend.entity.Favorite;

import java.util.List;
import java.util.Optional;

public interface FavoriteService {
    public List<Favorite> findByAccountId(Integer aid);
    public Optional<Favorite> findByProductId(Integer pid);
}
