package com.anshinbackend.service.impl;

import com.anshinbackend.dao.SizeDAO;
import com.anshinbackend.entity.Size;
import com.anshinbackend.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeServiceImpl implements SizeService {
    @Autowired
    SizeDAO _sizeDao;
    @Override
    public List<Size> findAllByProduct(Integer idProduct) {
        return _sizeDao.findListForProudct(idProduct);
    }
}
