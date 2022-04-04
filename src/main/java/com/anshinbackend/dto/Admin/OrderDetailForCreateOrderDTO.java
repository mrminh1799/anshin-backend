package com.anshinbackend.dto.Admin;

import com.anshinbackend.entity.OrderDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailForCreateOrderDTO {

    String productName;
    Integer price;
    OrderDetail orderDetail;
}
