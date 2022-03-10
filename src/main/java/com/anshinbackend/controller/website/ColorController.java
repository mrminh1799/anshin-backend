package com.anshinbackend.controller.website;

import com.anshinbackend.dto.ColorProductDetailDTO;
import com.anshinbackend.entity.Size;
import com.anshinbackend.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/color")
public class ColorController {
    @Autowired
    ColorService _colorService;
    @GetMapping("/findByProductId/{idProduct}")
    public ResponseEntity<List<?>> findForProduct(@PathVariable("idProduct") Integer id){
        return ResponseEntity.ok(_colorService.findAllForProduct(id));
    }
}
