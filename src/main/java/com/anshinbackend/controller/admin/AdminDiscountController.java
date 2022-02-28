package com.anshinbackend.controller.admin;

import com.anshinbackend.entity.Discount;

import com.anshinbackend.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin/discount")
public class AdminDiscountController   {
    @Autowired
    DiscountService discountService;

    @GetMapping()
    public List<Discount> getAll() {
        return discountService.findAll();
    }

    @GetMapping("{id}")
    public Discount getOne(@PathVariable("id")Integer id) {
        return discountService.findById(id);
    }

    @PostMapping()
    public Discount create(@RequestBody Discount discount) {
        return discountService.create(discount);
    }

    @PutMapping("{id}")
    public Discount update(@PathVariable("id")Integer id,@RequestBody Discount discount) {
        return discountService.update(discount);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id")Integer id) {
        discountService.delete(id);
    }
}
