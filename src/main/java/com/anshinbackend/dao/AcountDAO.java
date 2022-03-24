package com.anshinbackend.dao;

import com.anshinbackend.entity.Acount;

import org.apache.catalina.manager.util.SessionUtils;
import org.hibernate.Session;

import com.anshinbackend.entity.Order;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
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

    @Transactional
    @Modifying
    @Query("update Acount a set a.isDeleted = true where a.id = ?1")
    public void deleteAcount(Integer id);





    @Query("select a from Acount a where a.id=?1")
    public Optional<Acount> findBy(Integer id);


   // public Page<Acount> findAllBy(Acount a);


}
