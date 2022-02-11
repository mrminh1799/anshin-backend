package com.anshinbackend.controller.admin;

import com.anshinbackend.dto.AcountDTO;
import com.anshinbackend.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/acount")



public class AdminAcountController {

    @Autowired
    AcountService _service;
    @GetMapping("/findAll")
    public ResponseEntity<List<AcountDTO>> get(){
        return ResponseEntity.ok().body(_service.findAllAcount());


    }

}
