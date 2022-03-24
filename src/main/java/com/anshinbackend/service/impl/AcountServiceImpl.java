package com.anshinbackend.service.impl;

import com.anshinbackend.dao.AcountDAO;
import com.anshinbackend.dto.AcountDTO;
import com.anshinbackend.dto.Admin.PageAcount.PageDTO;
import com.anshinbackend.dto.PageInfo;
import com.anshinbackend.entity.Acount;
import com.anshinbackend.entity.Role;
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
    public PageDTO findBySample(PageInfo page, Acount a) {
        Pageable pageable = PageRequest.of(page.getIndex(), page.getSize());
        PageDTO pagedto = new PageDTO();
        com.anshinbackend.dto.Admin.PageAcount.AcountDTO dto = new com.anshinbackend.dto.Admin.PageAcount.AcountDTO();
        List<com.anshinbackend.dto.Admin.PageAcount.AcountDTO> contents = new ArrayList<>();
        Page <Acount> queryPage =acountDAO.findAll(Example.of(a), pageable);
        queryPage.getContent().forEach(x->{
            dto.setId(x.getId());
            dto.setPhoto(x.getPhoto());
            dto.setEmail(x.getEmail());
            dto.setPhoneNumber(x.getPhoneNumber());

            dto.setFullName(x.getFullName());
            dto.setIsActive(x.getIsActive());
            contents.add(dto);
        });

        pagedto.setContent(contents);
        pagedto.setCurrentPage(queryPage.getNumber());
        pagedto.setTotalPage(queryPage.getTotalPages());
        pagedto.setNumRec(queryPage.getSize());
        pagedto.setTotalPage(queryPage.getTotalPages());
        pagedto.setTotalRecord(queryPage.getTotalElements());



        return pagedto;

    }

}
