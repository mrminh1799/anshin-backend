package com.anshinbackend.service.impl;

import com.anshinbackend.dao.SizeDAO;
import com.anshinbackend.entity.Size;
import com.anshinbackend.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SizeServiceImpl implements SizeService {
    @Autowired
    SizeDAO _sizeDAO;
    @Override
    public List<Size> findAllByProduct(Integer idProduct) {
        return _sizeDAO.findListForProudct(idProduct);
    }

    @Override
    public List<Size> findAll() {
        return _sizeDAO.findAll();
    }

    @Override
    public Optional<Size> findById(Integer id) {
        return _sizeDAO.findById(id);
    }

    @Override
    public Size create(Size size) {
        size.setIsDelete(false);
        return  _sizeDAO.save(size);
    }

    @Override
    public Size update(Size size) {
        return _sizeDAO.save(size);
    }

    @Override
    public Integer delete(Integer id) {
        _sizeDAO.deleteSize(id);
        return 1;
    }

    @Override
    public List<Size> findByIsdeleteSize() {
        return  _sizeDAO.findByIsdeleteSize();
    }


}
