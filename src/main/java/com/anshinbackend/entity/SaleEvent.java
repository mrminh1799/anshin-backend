package com.anshinbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table( name = "sale_events")
public class SaleEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "name_event")
    String nameEvent;

    @Column(name = "start_time")
    Date startTime;

    @Column(name = "end_time")
    Date endTime;

    @Column(name = "sale_style")
    Integer saleStyle;

    @Column(name = "status")
    Boolean status;

    @Column(name = "is_deleted")
    Boolean isDeleted;


    @JsonIgnore
    @OneToMany(mappedBy = "saleEvent")
    List<Discount> listDiscounts;



}
