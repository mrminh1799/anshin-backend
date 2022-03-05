package com.anshinbackend.controller.admin;

import com.anshinbackend.dto.AcountDTO;
import com.anshinbackend.entity.Acount;
import com.anshinbackend.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/acount")
@CrossOrigin("*")



public class AdminAcountController {

    @Autowired
    AcountService _service;
    @GetMapping("/findAll")
    public ResponseEntity<List<AcountDTO>> get(){
        return ResponseEntity.ok().body(_service.findAllAcount());
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Acount> findByID(@PathVariable("id") Integer id){
        return ResponseEntity.ok().body(_service.findById(id));
    }

    @GetMapping("/findByPhoneNumber/{phoneNumber}")
    public ResponseEntity<Acount> findByPhoneNumber(@PathVariable("phoneNumber") String phonenumber){
        return ResponseEntity.ok().body(_service.findByPhoneNumber(phonenumber));
    }

    @PostMapping ("/createAcount")
    public ResponseEntity<Acount> createAcount(@RequestBody Acount e){
        return  ResponseEntity.ok().body(_service.insertAcount(e));
    }

    @PutMapping("/updateAcount")
    public ResponseEntity<Acount> updateAcount( @RequestBody Acount e){
        return ResponseEntity.ok().body(_service.updateAcount(e));
    }

    @DeleteMapping("/deleteAcount/{id}")
    public ResponseEntity<Acount> deleteByID(@PathVariable Integer id){
        System.out.println(id);
        _service.delete(id);
        return ResponseEntity.ok().body(null);
    }




}
