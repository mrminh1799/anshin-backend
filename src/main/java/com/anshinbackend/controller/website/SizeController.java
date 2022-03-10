package com.anshinbackend.controller.website;

import com.anshinbackend.entity.Size;
import com.anshinbackend.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
