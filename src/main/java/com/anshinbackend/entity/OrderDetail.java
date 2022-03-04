package com.anshinbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "detail_orders")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "id_product_detail")
    DetailProduct detailProduct;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;
}
