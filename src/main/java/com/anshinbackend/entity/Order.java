package com.anshinbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "orders")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="full_name")
    private String fullName;

    @Column(name ="phone_number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "address_detail")
    private String address_detail;

    @Column(name = "time_create")
    private Date time_create;

    @Column(name = "staff_id")
    private Integer  staff_id;

    @Column(name = "delivery_cost")
    private String  delivery_cost;

    @Column(name = "return_order")
    private Boolean return_order;

    @Column(name = "status")
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "id_acount")
    private Acount acount;

    @JsonIgnore
    @OneToMany(mappedBy = "order")
    List<OrderDetail> listOrderDetail;

}
