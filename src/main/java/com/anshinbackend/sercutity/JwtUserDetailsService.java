package com.anshinbackend.sercutity;

import com.anshinbackend.entity.Acount;
import com.anshinbackend.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private AcountService _acountService;




    @Override
    public UserDetails loadUserByUsername(String phoneNumber) throws UsernameNotFoundException {
        Acount acount = _acountService.findByPhoneNumber(phoneNumber);
        if(acount== null){


            throw new UsernameNotFoundException("User not found with phonenumber: "+phoneNumber);

        }


        return new User(acount.getPhoneNumber(), acount.getPassword(), new ArrayList<>());
    }



//    @Autowired private AccountRepository accountRepo;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
//        Account account = accountRepo.findByUsername(username);
//        if(account == null) {
//            throw new AppException(ResponeCustom.MESSAGE_CODE_KHONG_TON_TAI, "Username không tồn tại");
//        }
//        String password = account.getPassword();
//        String[] roles = account.getRoleAccount().stream().map(rn -> rn.getRole().getName())
//                .collect(Collectors.toList()).toArray(new String[0]);
//        return org.springframework.security.core.userdetails.User.withUsername(username).password(password).roles(roles).build();
//    }
}
