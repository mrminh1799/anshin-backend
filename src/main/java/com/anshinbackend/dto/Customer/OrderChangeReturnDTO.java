package com.anshinbackend.dto.Customer;


import com.anshinbackend.dto.OrderProductDetailDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderChangeReturnDTO {
    Integer idAcount;
    String fullName;
    String address;
    String detailAddress;
    String phoneNumber;
    List<OrderProductDetailDTO> listOrderProductDetailDTO;
    Integer status;
    String reason;


}
