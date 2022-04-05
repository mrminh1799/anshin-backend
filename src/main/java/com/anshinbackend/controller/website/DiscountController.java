package com.anshinbackend.controller.website;


import com.anshinbackend.dto.DiscountDTO;
import com.anshinbackend.entity.Discount;
import com.anshinbackend.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;
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


    @GetMapping("/findBySaleEventId/{eventId}")
    public ResponseEntity<?> getDistcountForEventId(@PathVariable("eventId")Integer id){
        return  ResponseEntity.ok(discountService.findByEventId(id));
    }

    @GetMapping("/updateStatusEventById/{id}")
    public ResponseEntity<?> updateStatusEvent(@PathVariable("id") Integer id){
        discountService.updateStatusEventForIdEvent(id);
        return ResponseEntity.ok("Up date status event thanh cong");
    }

    @GetMapping("/deleteDiscountForId/{id}")
    public ResponseEntity<?> deleteDiscountForId(@PathVariable("id") Integer id){
        discountService.deleteDiscountForId(id);
        return ResponseEntity.ok("Xoa thanh cong");
    }


    @PutMapping("/updateDiscount/{id}")
    public ResponseEntity<?> updateDiscount(@PathVariable("id") Integer idDiscount, @RequestBody Map map){
        Boolean styleDiscount=null;
        Integer discount=null;
        if(map.get("styleDiscount")!=null && map.get("discount")!=null){
            styleDiscount = Boolean.parseBoolean(map.get("styleDiscount").toString());
            discount = Integer.parseInt(map.get("discount").toString());
        }
        return ResponseEntity.ok(discountService.updateDiscountForId(idDiscount, styleDiscount, discount));


    }


}
