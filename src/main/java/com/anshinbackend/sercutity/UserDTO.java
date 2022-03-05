package com.anshinbackend.sercutity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class UserDTO {
    private Integer id;
    private String username;
    private String password;
    private String accessToken;
    private String fullname;
    private String photo;
    private List<String> roles;
    private  String email;
    private  Boolean isActive;


}
