package com.anshinbackend.dto.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class OrderDTO {
    Integer orderId;
    String dress;
    String dressDetail;
    Date createDate;
    String phoneNumber;
    Integer sumPrice;
    List<OrderDetailDTO> listOrderDetailDTO;


}
