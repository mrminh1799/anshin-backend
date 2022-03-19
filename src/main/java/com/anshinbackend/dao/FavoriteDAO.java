package com.anshinbackend.dao;

import com.anshinbackend.entity.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FavoriteDAO extends JpaRepository<Favorite, Integer> {
    @Query("SELECT f FROM Favorite f WHERE f.account.id=?1")
    List<Favorite> findByAccountId(Integer aid);

    @Query("SELECT COUNT(f) FROM Favorite f WHERE f.product.id=?1")
    Optional<Favorite> findByProductId(Integer pid);
}
