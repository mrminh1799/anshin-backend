package com.anshinbackend.controller.admin;

import com.anshinbackend.entity.Role;
import com.anshinbackend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/admin/role")
@CrossOrigin("*")

@RestController
public class AdminRoleController {
    @Autowired
    private RoleService _roleService;
    @GetMapping("/findAll")
    public ResponseEntity<List<Role>> findAll(){
        return ResponseEntity.ok(_roleService.findAll());
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<Role> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(_roleService.findById(id));
    }

}
