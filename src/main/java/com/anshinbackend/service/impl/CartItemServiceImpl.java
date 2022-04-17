package com.anshinbackend.service.impl;

import com.anshinbackend.dao.CartItemDAO;
import com.anshinbackend.dto.CartItemDTO;
import com.anshinbackend.entity.CartItem;
import com.anshinbackend.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CartItemServiceImpl implements CartItemService {
    @Autowired
    CartItemDAO _cartItemDao;
    @Override
    public List<CartItemDTO> findByAccountId(Integer id) {
        List<CartItemDTO> list= new ArrayList<>();
        _cartItemDao.findByAcountId(id).forEach(x->{
            list.add(new CartItemDTO(x.getDetailProduct().getId(), x.getQuantity()));
        });
        return  list;
    }

    @Override
    public List<CartItem> findAll() {
        return _cartItemDao.findAll();
    }

    @Override

    public void deleteBy(Integer id) {
        _cartItemDao.deleteBy(id);
    }

    public void Create(CartItem cartItem) {
        _cartItemDao.save(cartItem);
    }

    @Override
    public void deleteByIdProduct(Integer id) {
        _cartItemDao.deleteByIdProduct(id);
    }


}
