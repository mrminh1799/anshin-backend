package com.anshinbackend.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="dress_detail")
    private String dressDetail;
    @Column(name="dress_name")
    private String dressName;
    @ManyToOne
    @JoinColumn(name = "acount_id")
    private Acount acount;
}
