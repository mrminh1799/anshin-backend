package com.anshinbackend.controller;

import com.anshinbackend.config.JwtTokenUtil;
import com.anshinbackend.entity.Acount;
import com.anshinbackend.sercutity.JwtRequest;
import com.anshinbackend.sercutity.JwtUserDetailsService;
import com.anshinbackend.sercutity.UserDTO;
import com.anshinbackend.service.AcountService;
import com.anshinbackend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class Login {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUserDetailsService jwtUserDetailsService;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    AcountService _acountService;

    @Autowired
    RoleService _roleService;


    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<UserDTO> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest)  throws Exception{
        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

        final UserDetails userDetails = jwtUserDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());

        final String token = jwtTokenUtil.generateToken(userDetails);
        Acount acount= _acountService.findByPhoneNumber(authenticationRequest.getUsername());
        Integer id = acount.getId();
        String phoneNumber = acount.getPhoneNumber();
        String fullName = acount.getFullName();
        String email = acount.getEmail();
        String photo = acount.getPhoto();

        List<String> roles =  new ArrayList<>();
                acount.getRoleAcounts().stream().forEach(x->roles.add(x.getRole().getRoleName()));

    Boolean isActive = acount.getIsActive();

        UserDTO userLoginDTO = new UserDTO();
        userLoginDTO.setId(id);
        userLoginDTO.setFullname(fullName);
        userLoginDTO.setAccessToken(token);
        userLoginDTO.setUsername(phoneNumber);
        userLoginDTO.setEmail(email);
        userLoginDTO.setPhoto(photo);
        userLoginDTO.setRoles(roles);
        userLoginDTO.setIsActive(isActive);
        return ResponseEntity.ok(userLoginDTO );
    }


    private void authenticate(String username, String password) throws Exception {
        try {
            System.out.println("4");
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

        }catch (DisabledException e){
            System.out.println("5");
            throw new Exception("USER_DISABLED", e);
        }catch (BadCredentialsException e){
            e.printStackTrace();
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}
