package com.anshinbackend.controller.admin.supperAdmin;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/superAdmin/test")
@CrossOrigin("*")

public class Test {
    @GetMapping()
    public  String testHello(){
        return  "Hello_SUPER_Admin";
    }
}
