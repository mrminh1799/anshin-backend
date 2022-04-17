package com.anshinbackend.dto.Admin.PageAcount;

import com.anshinbackend.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcountDTO {
    public Integer id;

    private String phoneNumber;

    private String fullName;

    private List<String> roles;

    private String email;



    private Boolean isActive;

    private String photo;

}
