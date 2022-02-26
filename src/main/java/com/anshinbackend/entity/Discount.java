package com.anshinbackend.entity;

import javax.persistence.*;

import lombok.Data;

@Table(name = "discounts")
@Entity
@Data
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "discount")
    private Integer discount;

    @Column(name = "product_detail_id")
    private Integer product_detail_id;

    @Column(name = "sale_Event_id")
    private Integer  sale_Event_id;

}
