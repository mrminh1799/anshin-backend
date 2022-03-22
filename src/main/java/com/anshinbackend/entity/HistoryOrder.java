package com.anshinbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Table(name = "history_orders")
@Entity
@Data

@AllArgsConstructor
@NoArgsConstructor
public class HistoryOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date_create")
    Date dateCreate;

    @ManyToOne
    @JoinColumn (name  = "order_id")
    Order order;

    @Column(name = "description")
    String reason;


}
