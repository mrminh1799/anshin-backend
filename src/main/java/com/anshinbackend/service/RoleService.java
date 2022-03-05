package com.anshinbackend.service;

import com.anshinbackend.entity.Role;

import java.util.List;

public interface RoleService {
    public List<Role> findAll();
    public Role findById(Integer id);
}
