package com.anshinbackend.controller.website;

import com.anshinbackend.entity.Size;
import com.anshinbackend.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/size")
@CrossOrigin("*")
public class SizeController {
    @Autowired
    SizeService _sizeService;
    @GetMapping("/findByProductId/{idProduct}")
    public ResponseEntity<List<Size>> findForProduct(@PathVariable("idProduct") Integer id){
        return ResponseEntity.ok(_sizeService.findAllByProduct(id));
    }
    @GetMapping("/findAll")
    public List<Size> getAll() {
        return _sizeService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Size> getOne(@PathVariable("id")Integer id) {
        return _sizeService.findById(id);
    }

    @PostMapping("/create")
    public Size create(@RequestBody Size size) {
        return _sizeService.create(size);
    }

    @PutMapping("{id}")
    public Size update(@PathVariable("id")Integer id,@RequestBody Size size) {
        return _sizeService.update(size);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Size> deleteByID(@PathVariable Integer id) {
        _sizeService.delete(id);
        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/findByIsdeleteSize")
    public List<Size> findByIsdeleteSize(){
        return _sizeService.findByIsdeleteSize();
    }
}
