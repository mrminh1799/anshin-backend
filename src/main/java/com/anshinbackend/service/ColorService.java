package com.anshinbackend.service;

import java.util.List;

import com.anshinbackend.entity.Color;

public interface ColorService  {

	Color create(Color color);

	List<Color> findAll();

	Color findById(int id);
}
