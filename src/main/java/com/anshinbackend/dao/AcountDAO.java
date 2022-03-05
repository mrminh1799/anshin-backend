package com.anshinbackend.dao;

import com.anshinbackend.entity.Acount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface AcountDAO extends JpaRepository<Acount, Integer> {
    public List<Acount> findByIsDeletedIsFalse();
    public Acount findAcountByPhoneNumber(String phoneNumber);
    public Optional<Acount> findById(Integer id);
    @Transactional
    @Modifying
    @Query("update Acount a set a.isDeleted = true where a.id = ?1")
    public void deleteAcount(Integer id);

}
