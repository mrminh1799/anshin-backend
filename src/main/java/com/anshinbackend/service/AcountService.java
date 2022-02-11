package com.anshinbackend.service;

import com.anshinbackend.dto.AcountDTO;
import com.anshinbackend.entity.Acount;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AcountService {
    public List<AcountDTO> findAllAcount();
}
