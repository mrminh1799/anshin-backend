package com.anshinbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import poly.store.entity.Order;
import poly.store.entity.Product;

@Table(name = "detail_orders")
@Entity
@Data
public class Detail_orders {

	@Id
    private Integer id;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "id_product_detail")
//    @Column(name = "id_product_detail")
//    private Integer  id_product_detail;
    Product id_product_detail;

    @ManyToOne
	@JoinColumn(name = "order_id")
	
//    @Column(name = "order_id")
//    private Integer order_id;
    Order order;
    
    
}
