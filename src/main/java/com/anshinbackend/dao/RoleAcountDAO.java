package com.anshinbackend.dao;

import com.anshinbackend.entity.RoleAcount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleAcountDAO extends JpaRepository<RoleAcount,Integer> {
}
