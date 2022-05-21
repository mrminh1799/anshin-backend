package com.anshinbackend.controller.website;

import com.anshinbackend.dao.AcountDAO;
import com.anshinbackend.dto.RegisterDTO.RegisterResquestDTO;
import com.anshinbackend.entity.Acount;
import com.anshinbackend.sercutity.JwtUserDetailsService;
import com.anshinbackend.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
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

    @Autowired
    AcountDAO acountDAO;

    String codeRegister ="";

    String codeFGPassword="";

    @Autowired
    PasswordEncoder passwordEncoder;

  

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

    @PostMapping("/updateAcount")
    public ResponseEntity<?> updateAcount( @RequestBody Acount e){
        return ResponseEntity.ok().body(acountService.updateAcount(e));
    }


    @PostMapping("/valid-register")
     public String validRegister(@RequestBody  RegisterResquestDTO dto) {
        if(acountService.validRegister(dto)!=""){
            return acountService.validRegister(dto);
        }else{
            this.codeRegister = acountService.RegesterSendMail(dto.getEmail());
        }
        return "Gửi code vào mail rồi đấy";

    }
    @PostMapping("/register/{codeRegister}")
    public  ResponseEntity<?> register(@PathVariable("codeRegister") String code, @RequestBody  RegisterResquestDTO dto){
       if(code.equals(this.codeRegister)){
           acountService.Register(dto);
           this.codeRegister="abc";

           return  ResponseEntity.ok("đăng ký thành công");
       }else {
           return ResponseEntity.ok("4");
       }

    }

    @GetMapping("/valid-forget-password/{email}")
    public String validForgetPassword(@PathVariable("email") String email){
        if(acountDAO.findByEmail(email)==null){
            return "5";
        }
        else {
            this.codeFGPassword = acountService.FGPasswordSendMail(email);

            return "Gủi code vào mail rồi đấy";
        }

    }

    @GetMapping("/forget-password/{email}/{codeVL}/{password}")
    public  ResponseEntity<?> resetPassword(@PathVariable("email") String email,
                                            @PathVariable("codeVL") String code,
                                            @PathVariable("password") String password){
        if(code.equals(this.codeFGPassword)){
            Acount acount = acountDAO.findByEmail(email);
            acount.setPassword(passwordEncoder.encode(password));
            acountDAO.save(acount);
            return  ResponseEntity.ok("Đổi mật khẩu thành công");
        }else {
            return ResponseEntity.ok("4");
        }

    }










}
