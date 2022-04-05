package com.anshinbackend.controller.admin;



import com.anshinbackend.dao.RoleAcountDAO;
import com.anshinbackend.dto.AcountDTO;
import com.anshinbackend.dto.PageInfo;
import com.anshinbackend.entity.Acount;
import com.anshinbackend.entity.Role;
import com.anshinbackend.entity.RoleAcount;
import com.anshinbackend.service.AcountService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin/acount")
@CrossOrigin("*")

public class AdminAcountController {

    @Autowired
    AcountService _service;
    @Autowired
    RoleAcountDAO roleAcountDAO;

    @GetMapping("/findAll")
    public ResponseEntity<List<AcountDTO>> get(){
        return ResponseEntity.ok().body(_service.findAllAcount());
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Acount> findByID(@PathVariable("id") Integer id){
        return ResponseEntity.ok().body(_service.findById(id));
    }

    @GetMapping("/findByPhoneNumber/{phoneNumber}")
    public ResponseEntity<Acount> findByPhoneNumber(@PathVariable("phoneNumber") String phonenumber){
        return ResponseEntity.ok().body(_service.findByPhoneNumber(phonenumber));
    }

    @PostMapping ("/createAcount")
    public ResponseEntity<Acount> createAcount(@RequestBody Acount e){
        return  ResponseEntity.ok().body(_service.insertAcount(e));
    }


    @PostMapping ("/createAdminAcount/{id_role}/{role_name}")
    public ResponseEntity<Acount> createAdminAcount(@RequestBody Acount e,@PathVariable("id_role")Integer id
    ,@PathVariable("role_name")String roleName){
        Acount acc=_service.insertAcount(e);
        Role role= new Role(id,roleName);
        RoleAcount roleAcount= new RoleAcount(role,e);
        roleAcountDAO.save(roleAcount);
        List<RoleAcount> list= new ArrayList<>();
        list.add(roleAcount);
        e.setRoleAcounts(list);
        return  ResponseEntity.ok().body(acc);
    }
    @PutMapping("/updateAcount")
    public ResponseEntity<Acount> updateAcount( @RequestBody Acount e){
        return ResponseEntity.ok().body(_service.UpdateAcount(e));
    }
    @PutMapping("/updateAcount/{is_active}")
    public ResponseEntity<Acount> updateAcountIsActive( @RequestBody Acount e,@PathVariable("is_active")Boolean check){
        e.setIsActive(check);
        return ResponseEntity.ok().body(_service.UpdateAcount(e));
    }

    @DeleteMapping("/deleteAcount/{id}")
    public ResponseEntity<Acount> deleteByID(@PathVariable Integer id){
        System.out.println(id);
        _service.delete(id);
        return ResponseEntity.ok().body(null);
    }


    @PostMapping("/findBySample/{pageCurent}/{sizePage}")
    public ResponseEntity<?> findBySample(@PathVariable("pageCurent") Integer pageCurent,
                                          @PathVariable("sizePage")Integer sizePage,
                                          @RequestBody Acount sample) {
        PageInfo pageInfo = new PageInfo(pageCurent, sizePage);
        return ResponseEntity.ok(_service.findBySample(pageInfo, sample));



    }
    @GetMapping("/findByRoleAdminAndSuperAdmin")
    public ResponseEntity<List<Acount>> findAllByRoleAdminAndSuperAdmin(){
        return ResponseEntity.ok().body(_service.findByRole());
    }
    @GetMapping("/findByFullNamePhoneNumberAndRole")
    public ResponseEntity<List<Acount>> findByFullNamePhoneNumberAndRole(@RequestParam("fullName")String fullName
    ,@RequestParam("phoneNumber") String phoneNumber,@RequestParam("role") String role,@RequestParam("is_active")
     boolean check
    ){
        return ResponseEntity.ok().body(_service.findByFullNamePhoneAndRole(fullName,phoneNumber,role,check));
    }




}
