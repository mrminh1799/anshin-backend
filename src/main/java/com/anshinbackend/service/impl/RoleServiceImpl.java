package com.anshinbackend.service.impl;

import com.anshinbackend.dao.RoleDAO;
import com.anshinbackend.entity.Role;
import com.anshinbackend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDAO _roleDAO;
    @Override
    public List<Role> findAll() {
        return _roleDAO.findAll();
    }

    @Override
    public Role findById(Integer id) {
        return _roleDAO.findById(id).get();
    }
}
