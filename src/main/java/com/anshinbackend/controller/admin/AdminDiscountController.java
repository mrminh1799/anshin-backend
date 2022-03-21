package com.anshinbackend.controller.admin;

import com.anshinbackend.entity.Discount;
import com.anshinbackend.entity.Product;
import com.anshinbackend.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin/Discount")
@CrossOrigin("*")
public class AdminDiscountController {
    @Autowired
    DiscountService discountService;

    @GetMapping("/findAll")
    public ResponseEntity<List<Discount>> findAll(){
        return ResponseEntity.ok().body(discountService.findAll());
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Discount>> getOne(@PathVariable("id")Integer id){
        return  ResponseEntity.ok().body(discountService.findById(id));
    }
    @PostMapping("/create")
    public ResponseEntity<Discount> insert(@RequestBody Discount discount){
        return ResponseEntity.ok().body(discountService.insert(discount));
    }
    @PostMapping("/update")
    public ResponseEntity<Discount> update(@RequestBody Discount discount){
        return ResponseEntity.ok().body(discountService.update(discount));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Discount> delete(@PathVariable("id") Integer id){
        discountService.delete(id);
        return  ResponseEntity.ok(null);
    }
}
