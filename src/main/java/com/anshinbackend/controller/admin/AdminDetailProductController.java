package com.anshinbackend.controller.admin;

import com.anshinbackend.entity.DetailProduct;
import com.anshinbackend.service.DetailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/detailProduct")
@CrossOrigin("*")

public class AdminDetailProductController {
    @Autowired
    DetailProductService _detaiProductService;
    @GetMapping("/findAll")
    public ResponseEntity<List<DetailProduct>> findAll(){
        return  ResponseEntity.ok().body(_detaiProductService.findAll());
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<DetailProduct> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok().body(_detaiProductService.findById(id));
    }

    @PostMapping("/insert")
    public ResponseEntity<DetailProduct> insert(@RequestBody DetailProduct p){
        return ResponseEntity.ok().body(_detaiProductService.insert(p));
    }

    @PutMapping("/update")
    public ResponseEntity<DetailProduct> update(@RequestBody DetailProduct p){
        return ResponseEntity.ok().body(_detaiProductService.update(p));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DetailProduct> update(@PathVariable Integer id){
        _detaiProductService.delete(id);
         return ResponseEntity.ok().body(null);

    }

}
