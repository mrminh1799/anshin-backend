package com.anshinbackend.controller.admin;

import com.anshinbackend.entity.SaleEvent;
import com.anshinbackend.service.SaleEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin/saleEvent")
@CrossOrigin("*")

public class AdminSaleEventController {
    @Autowired
    SaleEventService _saleEventService;

    @GetMapping("/findAll")
    public ResponseEntity<List<SaleEvent>> findAll(){
        return ResponseEntity.ok().body(_saleEventService.findAll());
    }

    @GetMapping("/findById/{id}")
    public  ResponseEntity<SaleEvent> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok().body(_saleEventService.findById(id));
    }

    @PostMapping("/insert")
    public  ResponseEntity<SaleEvent> insert(@RequestBody SaleEvent e){
        return  ResponseEntity.ok().body(_saleEventService.insert(e));
    }

    @PutMapping("/update")
    public  ResponseEntity<SaleEvent> update(@RequestBody SaleEvent e){
        return  ResponseEntity.ok().body(_saleEventService.update(e));
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> delete(@PathVariable("id") Integer id){
        _saleEventService.delete(id);
        return  ResponseEntity.ok().body(null);
    }
}
