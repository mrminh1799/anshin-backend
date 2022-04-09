package com.anshinbackend.service.impl;

import com.anshinbackend.dao.DiscountDAO;
import com.anshinbackend.dto.DiscountDTO;
import com.anshinbackend.entity.Discount;
import com.anshinbackend.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public DiscountDTO insert(Discount discount) {
         _ddao.save(discount);
        Integer discount1 = 0;
        Discount x = _ddao.findById(discount.getId()).get();
        DiscountDTO dto = new DiscountDTO();
        dto.setIdDiscount(x.getId());
        dto.setIdProduct(x.getProduct().getId());
        dto.setProductName(x.getProduct().getProductName());
        dto.setIdSaleEvent(x.getSaleEvent().getId());
        dto.setSaleName(x.getSaleEvent().getNameEvent());
        dto.setStyleDiscount(x.getStyleDiscount());
        dto.setDiscount(x.getDiscountprice());
        double discountP =0;
        if(!x.getStyleDiscount()){
            discount1 = x.getDiscountprice();

        }else {
            discountP = (double)x.getProduct().getPrice()*(double)x.getDiscountprice()/(double)100;
            System.out.println(discount1);
        }
        dto.setDiscountPrice((int)discount1);



        return dto;

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
