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


    @ManyToOne
    @JoinColumn(name = "product_detail_id")
    private DetailProduct detailProduct;


    @ManyToOne
    @JoinColumn(name = "sale_Event_id")
    SaleEvent saleEvent;

}
