package com.anshinbackend.controller.website;

import com.anshinbackend.entity.Acount;
import com.anshinbackend.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")

@RequestMapping("/test")
public class AcountController {

    @Autowired
    AcountService acountService;

    @GetMapping("findBy/{id}")
    public Optional<Acount> findBy(@PathVariable("id")Integer id){
        return   acountService.findBy(id);
    }

    @PutMapping("/updateAcountUser")
    public ResponseEntity<Acount> updateAcount(@RequestBody Acount e){
        return ResponseEntity.ok().body(acountService.updateAcount(e));
    }

}
