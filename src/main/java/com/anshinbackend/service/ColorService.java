package com.anshinbackend.service;

import java.util.List;

import com.anshinbackend.dto.ColorProductDetailDTO;
import com.anshinbackend.entity.Color;
import com.anshinbackend.entity.Size;

public interface ColorService  {

	Color create(Color color);

	Color update(Color color);

	Integer delete(Integer id);

	List<Color> findAll();

	Color findById(int id);

	List<ColorProductDetailDTO> findAllForProduct(Integer id);

	List<Color> findByIsdeleteColor();

}
