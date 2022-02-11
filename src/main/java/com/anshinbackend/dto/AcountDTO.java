package com.anshinbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AcountDTO {

    private Integer id;

    private String phoneNumber;

    private String fullName;

    private String password;

    private String email;

    private Boolean isActive;

    private String photo;
}
