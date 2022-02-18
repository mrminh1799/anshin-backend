package com.anshinbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "discounts")
@Entity
@Data
public class Discount {

	@Id
    private Integer id;

    @Column(name = "discount")
    private Integer discount;

    @Column(name = "product_detail_id")
    private Integer product_detail_id;

    @Column(name = "sale_Event_id")
    private Integer  sale_Event_id;

}
