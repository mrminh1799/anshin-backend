package com.anshinbackend.entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "favories")
@Entity
@Data
public class Favorie {

	@Id
    private Integer id;

    @Column(name = "time_create")
    private LocalDate time_create;

    @Column(name = "id_product")
    private Integer id_product;

    @Column(name = "id_acount")
    private Integer  id_acount;

}
