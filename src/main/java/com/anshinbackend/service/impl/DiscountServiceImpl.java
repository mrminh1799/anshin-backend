package com.anshinbackend.service.impl;

import com.anshinbackend.dao.DiscountDAO;
import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.dto.DiscountDTO;
import com.anshinbackend.entity.Discount;
import com.anshinbackend.entity.Product;
import com.anshinbackend.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DiscountServiceImpl  implements DiscountService {
    @Autowired
    DiscountDAO _ddao;

    @Override
    public List<Discount> findAll() {
        return _ddao.findAll();
    }

    @Override
    public Optional<Discount> findById(Integer id) {
        return _ddao.findById(id);
    }

//    @Override
//    public List<DiscountDTO> findAllBySaleEven() {
//        List<DiscountDTO> list= new ArrayList<>();
//
//
//        _ddao.findAllBySaleEvent().forEach(x->{
//            DiscountDTO e = new DiscountDTO();
//            e.setId(x.getId());
//            e.setDiscount(String.valueOf(x.getDiscountprice()));
//            e.setProduct(x.getProduct());
//            e.setSaleEvent(x.getSaleEvent());
//            list.add(e);
//        });
//        return list ;
//    }

//    @Override
//    public List<DiscountDTO> findAllBySaleEven() {
//        List<DiscountDTO> list= new ArrayList<>();
//
//
//        _ddao.findAllBySaleEvent().forEach(x->{
//            DiscountDTO e = new DiscountDTO();
//            e.setId(x.getId());
//            e.setProduct((List<Product>) x.getProduct());
//
//            list.add(e);
//        });
//        return list ;
//    }


    @Override
    public Discount insert(Discount discount) {

        return _ddao.save(discount);
    }

    @Override
    public Discount update(Discount discount) {
        return _ddao.save(discount);
    }

    @Override
    public void delete(Integer id) {
        _ddao.deleteById(id);
    }
}
