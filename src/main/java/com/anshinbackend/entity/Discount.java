package com.anshinbackend.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "discounts")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "discount")
    private Integer discountprice;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


    @ManyToOne
    @JoinColumn(name = "sale_Event_id")
    SaleEvent saleEvent;

    @Column(name ="stye_discount")
    private  Boolean styleDiscount;



}
