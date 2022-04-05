package com.anshinbackend.service;

import com.anshinbackend.entity.RoleAcount;

public interface RoleAcountService {
    public RoleAcount save(RoleAcount roleAcount);
    public void delete(int id);
}
