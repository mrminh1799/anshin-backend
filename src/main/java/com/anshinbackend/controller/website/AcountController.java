package com.anshinbackend.controller.website;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")

@RequestMapping("/test")
public class AcountController {

    @GetMapping()
    public  String testHello(){
        return  "Customer";
    }
}
