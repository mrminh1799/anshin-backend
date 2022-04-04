package com.anshinbackend.sercutity;

import com.anshinbackend.dao.AcountDAO;
import com.anshinbackend.entity.Acount;
import com.anshinbackend.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private AcountService _acountService;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Autowired
    AcountDAO _acountDAO;


    @Override
    public UserDetails loadUserByUsername(String phoneNumber) throws UsernameNotFoundException {
        Acount acount = _acountService.findByPhoneNumber(phoneNumber);
        if(acount== null){

            throw new UsernameNotFoundException("User not found with phonenumber: "+phoneNumber);

        }


        String[] roles = acount.getRoleAcounts().stream().map(rn -> rn.getRole().getRoleName())
            .collect(Collectors.toList()).toArray(new String[0]);

        return org.springframework.security.core.userdetails.User.withUsername
                (acount.getPhoneNumber()).password(acount.getPassword()).roles(roles).build();
    }

    public Acount save(UserDTO user) {
        Acount newUser = new Acount();
        newUser.setId(user.getId());
        newUser.setFullName(user.getFullname());
        newUser.setPhoneNumber(user.getUsername());
        newUser.setEmail(user.getEmail());
        newUser.setPhoto(user.getPhoto());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        return _acountService.insertAcount(newUser);
    }

    public Boolean confirmPassword(Integer id, String passwordConfirm){

        Acount acount = _acountService.findById(id);
        System.out.println(acount.getPassword());
        return bcryptEncoder.matches(passwordConfirm, acount.getPassword());

    }


    public  void changePassword(Integer id , String password){
        Acount acount = _acountService.findById(id);
        acount.setPassword(bcryptEncoder.encode(password));
        _acountDAO.save(acount);

    }
}
