package com.anshinbackend.service.impl;

import com.anshinbackend.dao.AcountDAO;
import com.anshinbackend.dto.AcountDTO;
import com.anshinbackend.entity.Acount;
import com.anshinbackend.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class AcountServiceImpl implements AcountService {
    @Autowired
    private AcountDAO acountDAO;



    @Override
    public List<AcountDTO> findAllAcount() {
        List<AcountDTO> listAcountDTO = new ArrayList<>();
         acountDAO.findByIsDeletedIsFalse().forEach(e->{
             AcountDTO dto = new AcountDTO();
             dto.setId(e.getId());
             dto.setPhoneNumber(e.getPhoneNumber());
             dto.setEmail(e.getEmail());
             dto.setPassword(e.getPassword());
             dto.setFullName(e.getFullName());
             dto.setIsActive(e.getIsActive());
             listAcountDTO.add(dto);
         });
         return listAcountDTO;
    }

    @Override
    public Acount findByPhoneNumber(String phoneNumber) {
        return acountDAO.findAcountByPhoneNumber(phoneNumber);
    }

    @Override
    public Acount findById(Integer id){
        return acountDAO.findById(id).get();
    }

    @Override
    public Acount insertAcount(Acount e) {
        Integer id=  acountDAO.save(e).getId();
        e.setId(id);
        e.setIsActive(true);
        e.setIsDeleted(false);
        return e;
    }

    @Override
    public Acount updateAcount(Acount e) {
        return  acountDAO.save(e);
    }

    @Override
    public Integer delete(Integer id) {
        acountDAO.deleteAcount(id);
        return 1;
    }
}
