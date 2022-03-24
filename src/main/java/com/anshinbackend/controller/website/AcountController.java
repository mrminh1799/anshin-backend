package com.anshinbackend.controller.website;

import com.anshinbackend.entity.Acount;
import com.anshinbackend.sercutity.JwtUserDetailsService;
import com.anshinbackend.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")

@RequestMapping("/test")
public class AcountController {

    @Autowired
    AcountService acountService;
    @Autowired
    JwtUserDetailsService jwtUserDetailsService;

    @GetMapping("findBy/{id}")
    public Optional<Acount> findBy(@PathVariable("id")Integer id){
        return   acountService.findBy(id);
    }

  

    @GetMapping("/confirmPassword/{acountid}/{password}")
    public ResponseEntity<Boolean> confirmPassword(@PathVariable("acountid") Integer id,@PathVariable("password") String password){
        System.out.println(id);
        Boolean s =jwtUserDetailsService.confirmPassword(id, password);
        System.out.println(s);
        return ResponseEntity.ok(s);

    }

    @GetMapping("/changePassword/{acountid}/{password}")
    public ResponseEntity<?> changePassword(@PathVariable("acountid") Integer id,@PathVariable("password") String password){
        jwtUserDetailsService.changePassword(id, password);
        return ResponseEntity.ok("Đổi mật khẩu thành công");

    }




}
