package com.anshinbackend.service.impl;

import com.anshinbackend.dao.FavoriteDAO;
import com.anshinbackend.dto.Customer.FavoriteDTO;
import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.entity.Favorite;
import com.anshinbackend.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Autowired
    FavoriteDAO fDAO;

    @Override
    public List<FavoriteDTO> findByAccountId(Integer aid) {
        List<FavoriteDTO> list= new ArrayList<>();
        fDAO.findByAccountId(aid).forEach(x->{
            FavoriteDTO e = new FavoriteDTO();
            e.setIdFavorite(x.getId());
            e.setIdAcount(x.getAccount().getId());
            e.setIdProduct(x.getProduct().getId());
            e.setProductName(x.getProduct().getProductName());
            e.setPriceProduct(x.getProduct().getPrice());
            e.setImageProduct(x.getProduct().getImage());
            list.add(e);
        });
        return list;
//        return fDAO.findByAccountId(aid);
    }

    @Override
    public Optional<Favorite> findByProductId(Integer pid) {
        return fDAO.findByProductId(pid);
    }
}
