package com.anshinbackend.controller.admin;

import com.anshinbackend.entity.Size;
import com.anshinbackend.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin/sizes")
public class AdminSizeController {
    @Autowired
    SizeService sizeService;

    @GetMapping()
    public List<Size> getAll() {
        return sizeService.findAll();
    }

    @GetMapping("{id}")
    public Size getOne(@PathVariable("id")Integer id) {
        return sizeService.findById(id);
    }

    @PostMapping()
    public Size create(@RequestBody Size size) {
        return sizeService.create(size);
    }

    @PutMapping("{id}")
    public Size update(@PathVariable("id")Integer id,@RequestBody Size size) {
        return sizeService.update(size);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id")Integer id) {
        sizeService.delete(id);
    }

}
