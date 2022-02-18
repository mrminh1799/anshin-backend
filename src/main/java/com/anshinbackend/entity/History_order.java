package com.anshinbackend.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "history_orders")
@Entity
@Data
public class History_order {

	@Id
    private Integer id;

    @Column(name = "date_create")
    private Date date_create;

    @Column(name = "order_id")
    private Integer order_id;

    @Column(name = "description")
    private String  description;

}
