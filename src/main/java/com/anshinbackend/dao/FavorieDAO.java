package com.anshinbackend.dao;

import com.anshinbackend.entity.Favorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavorieDAO extends JpaRepository<Favorie, Integer> {
}
