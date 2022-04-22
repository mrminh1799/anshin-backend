package com.anshinbackend.service;

import com.anshinbackend.dto.Customer.FavoriteDTO;
import com.anshinbackend.entity.Favorite;

import java.util.List;
import java.util.Optional;

public interface FavoriteService {
    public List<FavoriteDTO> findByAccountId(Integer aid);
    public Optional<Favorite> findByProductId(Integer pid);
}
