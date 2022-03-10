package com.anshinbackend.dao;

import com.anshinbackend.dto.ColorProductDetailDTO;
import com.anshinbackend.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColorDAO extends JpaRepository<Color, Integer> {
    @Query(value = "select DISTINCT  colors.id, colors.color_name, detail_products.image from detail_products " +
            "inner join colors on detail_products.id_color = colors.id" +
            " where id_product =1", nativeQuery = true)
    List<ColorProductDetailDTO> findAllForProduct(Integer id);
}
