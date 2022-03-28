package com.anshinbackend.controller.admin;

import com.anshinbackend.entity.Acount;
import com.anshinbackend.entity.Role;
import com.anshinbackend.entity.RoleAcount;
import com.anshinbackend.service.AcountService;
import com.anshinbackend.service.RoleAcountService;
import com.anshinbackend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/roleAcount")
public class AdminRoleAcountController {
    @Autowired
    RoleAcountService service;
    @Autowired
    RoleService roleService;
    @Autowired
    AcountService acountService;
    @PostMapping("/create")
    public ResponseEntity<RoleAcount> createAcount(@RequestParam("roleId") int id
    ,@RequestParam("acountId")Integer acountId){
        Role role= new Role();
        role=roleService.findById(id);
        Acount acount= acountService.findById(acountId);
        RoleAcount roleAcount= new RoleAcount(role,acount);
        return  ResponseEntity.ok().body(service.save(roleAcount));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<RoleAcount> deleteByID(@PathVariable Integer id){

        service.delete(id);
        return ResponseEntity.ok().body(null);
    }
}
