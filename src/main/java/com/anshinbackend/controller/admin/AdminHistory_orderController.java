package com.anshinbackend.controller.admin;

import com.anshinbackend.entity.Favorie;
import com.anshinbackend.entity.History_order;
import com.anshinbackend.service.FavorieService;
import com.anshinbackend.service.History_orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin/history_order")
public class AdminHistory_orderController {
    @Autowired
    History_orderService History_orderSv;

    @GetMapping()
    public List<History_order> getAll() {
        return History_orderSv.findAll();
    }

    @GetMapping("{id}")
    public History_order getOne(@PathVariable("id")Integer id) {
        return History_orderSv.findById(id);
    }

    @PostMapping()
    public History_order create(@RequestBody History_order history_order) {
        return History_orderSv.create(history_order);
    }

    @PutMapping("{id}")
    public History_order update(@PathVariable("id")Integer id,@RequestBody History_order history_order) {
        return History_orderSv.update(history_order);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id")Integer id) {
        History_orderSv.delete(id);
    }
}
