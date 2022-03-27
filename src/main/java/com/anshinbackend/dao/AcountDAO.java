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
    
    @Query("select a from Acount a where a.email=?1")
    public Acount findByEmail(String email);
    @Query("select a from Acount a where a.token=?1")
    public Acount findByToken(String token);
    @Query(value = "select * from acounts a join role_acount ra on a.id=ra.acount_id join roles r on r.id=ra.role_id " +
            "where role_name='admin' or role_name ='supper_admin' ",nativeQuery = true)
    public List<Acount> findByRole();

    @Query(value = "select * from acounts a join role_acount ra on a.id=ra.acount_id join roles r on r.id=ra.role_id  "
    +"where a.full_name=?1 and a.phone_number=?2 and r.role_name=?3 and is_active=1",nativeQuery = true)
    public List<Acount> findByFullNamePhoneNumberRole(String fullName, String phoneNumber, String role);


   // public Page<Acount> findAllBy(Acount a);


}
