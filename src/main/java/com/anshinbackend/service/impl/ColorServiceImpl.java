package com.anshinbackend.service.impl;

import com.anshinbackend.dao.ColorDAO;

import com.anshinbackend.dto.ColorProductDetailDTO;
import com.anshinbackend.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Tuple;
import java.util.ArrayList;
import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {
    @Autowired
    ColorDAO _colorDAO;

    @Autowired
    EntityManager em;

    @Override
    public List<ColorProductDetailDTO> findAllForProduct(Integer id) {

        List<ColorProductDetailDTO>  listReturn= new ArrayList<>();

        String sql = "select DISTINCT  colors.id, colors.color_name, detail_products.image from detail_products inner join colors on detail_products.id_color = colors.id where id_product = "+id;

        Query query = em.createNativeQuery(sql, Tuple.class);
        List<Tuple> listResult = query.getResultList();

        for(Tuple x: listResult){
            Integer idColor = x.get("id", Integer.class);
            String nameColor =x.get("color_name", String.class);
            String image = x.get("image", String.class);
            listReturn.add(new ColorProductDetailDTO(id, nameColor, image));
        }



        return  listReturn;

    }
}
