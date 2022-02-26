package com.anshinbackend.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;

import lombok.Data;

@Table(name = "orders")
@Entity
@Data
public class Order  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

//    @ManyToOne
//    @JoinColumn(name = "fullName")
//    Account account;
            @JsonIgnore
            @OneToMany(mappedBy = "order")
            List<Detail_orders> orderDetails;
}
