package com.anshinbackend.service.impl;

import com.anshinbackend.dto.Admin.AdminDiscountDTO;
import com.anshinbackend.dao.DiscountDAO;
import com.anshinbackend.dao.SaleEventDAO;
import com.anshinbackend.entity.Discount;
import com.anshinbackend.entity.SaleEvent;
import com.anshinbackend.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DiscountServiceImpl  implements DiscountService {
    @Autowired
    DiscountDAO _ddao;

    @Autowired
    SaleEventDAO _saleEventDAO;

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

    @Override
    public List<AdminDiscountDTO> findByEventId(Integer id) {
        List<AdminDiscountDTO> listDTO = new ArrayList<>();
        _ddao.getBySaleEventId(id).forEach(x->{
            AdminDiscountDTO dto = new AdminDiscountDTO();
            dto.setIdDiscount(x.getId());
            dto.setIdProduct(x.getProduct().getId());
            dto.setProductName(x.getProduct().getProductName());
            dto.setStyleDiscount(x.getStyleDiscount());
            dto.setDiscount(x.getDiscountprice());
            double discount =0;
            if(!x.getStyleDiscount()){
                discount = x.getDiscountprice();

            }else {


                discount = (double)x.getProduct().getPrice()*(double)x.getDiscountprice()/(double)100;
                System.out.println(discount);
            }
            dto.setDiscountPrice((int)discount);
            listDTO.add(dto);


        });
        return listDTO;
    }

    @Override
    public void updateStatusEventForIdEvent(Integer idEvent) {
        SaleEvent e = _saleEventDAO.findById(idEvent).get();
        Boolean status = !e.getStatus();
        e.setStatus(status);
        _saleEventDAO.save(e);
    }

    @Override
    public void deleteDiscountForId(Integer id) {
        _ddao.deleteById(id);
    }

    @Override
    public AdminDiscountDTO updateDiscountForId(Integer idDiscount, Boolean styleDiscount, Integer discount) {
        _ddao.updateDiscountForId(styleDiscount, discount, idDiscount);
        Discount x = _ddao.findById(idDiscount).get();
        AdminDiscountDTO dto = new AdminDiscountDTO();
        dto.setIdDiscount(x.getId());
        dto.setIdProduct(x.getProduct().getId());
        dto.setProductName(x.getProduct().getProductName());
        dto.setStyleDiscount(x.getStyleDiscount());
        dto.setDiscount(x.getDiscountprice());
        double discountP =0;
        if(!x.getStyleDiscount()){
            discount = x.getDiscountprice();

        }else {
            discountP = (double)x.getProduct().getPrice()*(double)x.getDiscountprice()/(double)100;
            System.out.println(discount);
        }
        dto.setDiscountPrice((int)discount);



        return dto;
    }
}
