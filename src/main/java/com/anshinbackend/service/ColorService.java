package com.anshinbackend.service;

import com.anshinbackend.dao.ProductDetailDAO;
import com.anshinbackend.dto.ColorProductDetailDTO;

import java.util.List;

public interface ColorService  {
    public List<ColorProductDetailDTO> findAllForProduct(Integer id);
}
