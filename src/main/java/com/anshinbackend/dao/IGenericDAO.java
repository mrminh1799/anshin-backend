package com.anshinbackend.dao;

import java.util.Optional;

public interface IGenericDAO<T> {
	 public Iterable<T> findAll();
	 public Optional<T> findById(Integer id);
	 public T save(T t);
	 public void remove(Integer id);
	 
}
