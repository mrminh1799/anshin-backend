package com.anshinbackend.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    public
    Integer id;

    @Column(name = "name_event")
    String nameEvent;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    @Column(name = "start_time")
    String startTime;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    @Column(name = "end_time")
    String endTime;

    @Column(name = "status")
    Boolean status;

    @Column(name = "is_deleted")
    Boolean isDeleted;


    @JsonIgnore
    @OneToMany(mappedBy = "saleEvent")
    List<Discount> listDiscounts;



    }
