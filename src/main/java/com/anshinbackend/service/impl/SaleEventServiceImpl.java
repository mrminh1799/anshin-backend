package com.anshinbackend.service.impl;

import com.anshinbackend.dao.SaleEventDAO;
import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.entity.SaleEvent;
import com.anshinbackend.service.SaleEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SaleEventServiceImpl implements SaleEventService {

    @Autowired
    SaleEventDAO _saleEventDAO;
    @Override
    public List<SaleEvent> findAll() {
        List<SaleEvent> list= new ArrayList<>();
        _saleEventDAO.findByIsDeletedIsFalse().forEach(x->{
            SaleEvent e = new SaleEvent();
            e.setId(x.getId());
            e.setNameEvent(x.getNameEvent());
            e.setIsDeleted(x.getIsDeleted());
            e.setStartTime(x.getStartTime());
            e.setEndTime(x.getEndTime());
            e.setStatus(x.getStatus());
            list.add(e);
        });
        return list;

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
    public SaleEvent update1(SaleEvent e) {
        SaleEvent  saleEvent = _saleEventDAO.findById(e.id).get();

//        saleEvent.setId(e.id);
        saleEvent.setStatus(e.getStatus());

        return _saleEventDAO.save(saleEvent);
    }

    @Override
    public void delete(Integer id) {
        _saleEventDAO.deleteSaleEventById(id);
    }
}
