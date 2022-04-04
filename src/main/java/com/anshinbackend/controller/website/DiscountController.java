package com.anshinbackend.controller.website;


import com.anshinbackend.dto.DiscountDTO;
import com.anshinbackend.entity.Discount;
import com.anshinbackend.service.DiscountService;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/discount")
public class DiscountController {
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

}
