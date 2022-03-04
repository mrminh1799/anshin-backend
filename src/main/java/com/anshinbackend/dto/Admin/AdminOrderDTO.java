package com.anshinbackend.dto.Admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminOrderDTO {
    Integer id;
    Integer idAcount;
    Integer idStaff;
    String fullName;
    String address;
    String detailAddress;
    String phoneNumber;
    Integer status;
    Integer sumPrice;
    Date timeCreate;

}
