package com.anshinbackend.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;

import lombok.Data;

@Table(name = "orders")
@Entity
@Data
public class Order {

	@Id
    private Integer id;

    @Column(name = "address")
    private String address;

    @Column(name = "address_detail")
    private String address_detail;

    @Column(name = "time_create")
    private Date  time_create;

    @Column(name = "staff_id")
    private Integer  staff_id;
    
    @Column(name = "delivery_cost")
    private String  delivery_cost;
    
    @Column(name = "return_order")
    private Boolean return_order;
    
    @Column(name = "status")
    private Integer status;
    
    @Column(name = "id_acount")
    private Integer id_acount;
}
