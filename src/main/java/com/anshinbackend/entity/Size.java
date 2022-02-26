package com.anshinbackend.entity;

import javax.persistence.*;

import lombok.Data;

@Table(name = "sizes")
@Entity
@Data
public class Size {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	  @Column(name = "size_name")
	    private String size_name;



}
