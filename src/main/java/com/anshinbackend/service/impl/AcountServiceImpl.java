package com.anshinbackend.service.impl;

import com.anshinbackend.dao.AcountDAO;
import com.anshinbackend.dto.AcountDTO;
import com.anshinbackend.dto.PageInfo;
import com.anshinbackend.entity.Acount;
import com.anshinbackend.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class AcountServiceImpl implements AcountService {
    @Autowired
    private AcountDAO acountDAO;


    @Override
    public List<AcountDTO> findAllAcount() {
        List<AcountDTO> listAcountDTO = new ArrayList<>();
        acountDAO.findByIsDeletedIsFalse().forEach(e -> {
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
    public Acount findById(Integer id) {
        return acountDAO.findById(id).get();
    }

    @Override
    public Acount insertAcount(Acount e) {
        Integer id = acountDAO.save(e).getId();
        e.setId(id);
        e.setIsActive(true);
        e.setIsDeleted(false);
        return e;
    }


    @Override
    public Acount updateAcount(Acount e) {
        Acount acount = acountDAO.findById(e.getId()).get();
        acount.setId(e.getId());
        acount.setFullName(e.getFullName());
        acount.setPhoto(e.getPhoto());
        return acountDAO.save(acount);
    }
    public Acount UpdateAcount(Acount e) {
        return  acountDAO.save(e);

    }

    @Override
    public Integer delete(Integer id) {
        acountDAO.deleteAcount(id);
        return 1;
    }

    @Override
    public Optional<Acount> findBy(Integer id) {
        return Optional.of(acountDAO.findBy(id).get());
    }

    @Override
    public Page<Acount> findByExample(PageInfo page, Acount a) {
        Pageable pageable = PageRequest.of(page.getIndex(), page.getSize());

        //Pageable page = PageRequest.of(currentPage, sizePage);
       // return acountDAO.findAll(Example.of(a), pageable);
        return null;
    }

}
