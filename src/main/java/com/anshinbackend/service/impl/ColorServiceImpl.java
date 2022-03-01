package com.anshinbackend.service.impl;

import com.anshinbackend.dao.ColorDAO;

import com.anshinbackend.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorServiceImpl implements ColorService {
    @Autowired
    ColorDAO _colorDAO;
}
