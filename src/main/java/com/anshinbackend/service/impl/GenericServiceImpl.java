package com.anshinbackend.service.impl;


import com.anshinbackend.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class GenericServiceImpl<T, ID> implements GenericService<T, ID> {

//    @Autowired
//    JpaRepository<T, ID> genericRepo;
//
//    public JpaRepository<T, ID> getRepository() {
//        return genericRepo;
//    }
//
//    public T findById(ID id) {
//        return genericRepo.findById(id).orElse(null);
//    }
//
//    public List<T> findAll(List<ID> ids) {
//        return genericRepo.findAllById(ids);
//    }
//
//    public T save(T obj) throws Exception {
//        return genericRepo.save(obj);
//    }
//
//    public List<T> save(List<T> lst) throws Exception {
//        return genericRepo.saveAll(lst);
//    }
//
//    public void delete(ID key) {
//        genericRepo.deleteById(key);
//    }
//
//    public void delete(List<T> lst) {
//        genericRepo.deleteAll(lst);
//    }
//
//    public void deleteAll() {
//        genericRepo.deleteAll();
//    }
//
//    @Override
//    public void deleteAll(List<T> items) {
//        genericRepo.deleteAll(items);
//    }
//
//    public boolean existsById(ID key) {
//        return genericRepo.existsById(key);
//    }
//
//    @Override
//    public List<T> findAll() {
//        return genericRepo.findAll();
//    }
//
//
//    @Override
//    public List<T> findByExample(T e) {
//        return genericRepo.findAll(Example.of(e));
//    }
//
//
//
//
//
//    @Override
//    public void save(Iterable<T> lst) throws Exception{
//        genericRepo.saveAll(lst);
//    }
}
