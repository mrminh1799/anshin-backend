package com.anshinbackend.dto.RegisterDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterResquestDTO {
    String fullName;
    String phoneNumber;
    String email;
    String password;


}
