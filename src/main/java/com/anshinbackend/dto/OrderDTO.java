package com.anshinbackend.dto;

import com.anshinbackend.entity.OrderDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    Integer idAcount;
    String fullName;
    String address;
    String detailAddress;
    String phoneNumber;
    List<OrderProductDetailDTO> listOrderProductDetailDTO;
}
