package com.anshinbackend.controller;


import com.anshinbackend.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.anshinbackend.entity.Address;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressServiceImpl addressService;
    @PostMapping("/create")
    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
        return ResponseEntity.ok().body(addressService.createAndUpdateAddress(address));
    }
    @PutMapping("/update")
    public ResponseEntity<Address> updateAddress(@RequestBody Address address) {
        return ResponseEntity.ok().body(addressService.createAndUpdateAddress(address));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Address> delete(@PathVariable Integer id) {
        addressService.delete(id);
        return ResponseEntity.ok().body(null);

    }
    @GetMapping("/")
    public ResponseEntity<List<Address>> findAll() {

        return ResponseEntity.ok().body(addressService.findAll());
    }


}
