package com.anshinbackend.service.impl;

import com.anshinbackend.dao.RoleAcountDAO;
import com.anshinbackend.entity.RoleAcount;
import com.anshinbackend.service.RoleAcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleAcountServiceImpl implements RoleAcountService {
    @Autowired
    RoleAcountDAO roleAcountDAO;
    @Override
    public RoleAcount save(RoleAcount roleAcount) {
        return roleAcountDAO.save(roleAcount);
    }

    @Override
    public void delete(int id) {
        roleAcountDAO.deleteById(id);
    }
}
