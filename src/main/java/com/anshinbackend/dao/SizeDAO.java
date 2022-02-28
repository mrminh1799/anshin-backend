package com.anshinbackend.dao;

import com.anshinbackend.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SizeDAO extends JpaRepository<Size, Integer> {
         List<Size> findAll();
         Optional<Size> findById(Integer id);

         Size create(Size size);
         Size update(Size size);
         void  delete(Integer id);

}
