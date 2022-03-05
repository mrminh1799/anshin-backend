package com.anshinbackend.service;

import com.anshinbackend.entity.SaleEvent;

import java.util.List;

public interface SaleEventService {
    public List<SaleEvent> findAll();
    public SaleEvent findById(Integer id);
    public SaleEvent insert(SaleEvent e);
    public SaleEvent update(SaleEvent e);
    public void delete(Integer id);

}
