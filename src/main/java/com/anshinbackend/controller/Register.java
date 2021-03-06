package com.anshinbackend.controller;

import com.anshinbackend.sercutity.JwtUserDetailsService;
import com.anshinbackend.sercutity.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class Register {
    @Autowired
    JwtUserDetailsService userDetailsService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody UserDTO user) throws Exception {

        return ResponseEntity.ok(userDetailsService.save(user));
    }

}
