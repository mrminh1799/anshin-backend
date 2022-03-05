package com.anshinbackend.dao;

import com.anshinbackend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleDAO extends JpaRepository<Role, Integer> {
    public List<Role> findAll();
    public Optional<Role> findById(Integer id);
}
