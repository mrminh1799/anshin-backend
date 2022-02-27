package com.anshinbackend.controller.admin;

import com.anshinbackend.entity.Discount;
import com.anshinbackend.entity.Favorie;
import com.anshinbackend.service.DiscountService;
import com.anshinbackend.service.FavorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin/favorite")
public class AdminFavorieController {
    @Autowired
    FavorieService favorieService;

    @GetMapping()
    public List<Favorie> getAll() {
        return favorieService.findAll();
    }

    @GetMapping("{id}")
    public Favorie getOne(@PathVariable("id")Integer id) {
        return favorieService.findById(id);
    }

    @PostMapping()
    public Favorie create(@RequestBody Favorie favorie) {
        return favorieService.create(favorie);
    }

    @PutMapping("{id}")
    public Favorie update(@PathVariable("id")Integer id,@RequestBody Favorie favorie) {
        return favorieService.update(favorie);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id")Integer id) {
        favorieService.delete(id);
    }
}
