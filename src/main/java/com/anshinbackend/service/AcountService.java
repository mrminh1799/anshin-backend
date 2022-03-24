package com.anshinbackend.service;

import com.anshinbackend.dto.AcountDTO;
import com.anshinbackend.dto.PageInfo;
import com.anshinbackend.entity.Acount;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface AcountService {
    public List<AcountDTO> findAllAcount();
    public Acount findByPhoneNumber(String phoneNumber);
    public Acount findById(Integer id);
    public Acount insertAcount(Acount e);
    public Acount UpdateAcount(Acount e);
    public Integer delete(Integer id);
    public Acount updateAcount(Acount acount);

    public Optional<Acount> findBy(Integer id);
    public Page<Acount> findBySample(PageInfo page, Acount a);
}
