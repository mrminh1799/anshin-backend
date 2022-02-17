package com.anshinbackend.service.impl;

import com.anshinbackend.dao.SaleEventDAO;
import com.anshinbackend.entity.SaleEvent;
import com.anshinbackend.service.SaleEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleEventServiceImpl implements SaleEventService {

    @Autowired
    SaleEventDAO _saleEventDAO;
    @Override
    public List<SaleEvent> findAll() {
        return _saleEventDAO.findAll();
    }

    @Override
    public SaleEvent findById(Integer id) {
        return _saleEventDAO.findById(id).get();
    }

    @Override
    public SaleEvent insert(SaleEvent e) {
        e.setIsDeleted(false);
        Integer id = _saleEventDAO.save(e).getId();
        e.setId(id);
        e.setIsDeleted(false);
        return e;
    }

    @Override
    public SaleEvent update(SaleEvent e) {
        return _saleEventDAO.save(e);
    }

    @Override
    public void delete(Integer id) {
        _saleEventDAO.deleteSaleEventById(id);
    }
}
