package com.anshinbackend.service;

import com.anshinbackend.dto.AcountDTO;
import com.anshinbackend.entity.Acount;

import java.util.List;

public interface AcountService {
    public List<AcountDTO> findAllAcount();
    public Acount findByPhoneNumber(String phoneNumber);
    public Acount findById(Integer id);
    public Acount insertAcount(Acount e);
    public Acount updateAcount(Acount e);
    public Integer delete(Integer id);
}
