package com.anshinbackend.service;

import com.anshinbackend.dto.CartItemDTO;
import com.anshinbackend.dto.NavBar.CartDetailDTO;
import com.anshinbackend.entity.CartItem;
import org.springframework.security.core.userdetails.cache.SpringCacheBasedUserCache;

import java.util.List;

public interface CartItemService {
    public List<CartItemDTO> findByAccountId(Integer id);
    public List<CartItem> findAll();


    public void deleteBy(Integer id);

    public void Create(CartItem cartItem);

    public List<CartDetailDTO> findByIdAcount(Integer id);


}
