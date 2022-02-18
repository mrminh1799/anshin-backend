package com.anshinbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "sizes")
@Entity
@Data
public class Size {
	  @Id
	    private Integer id;
	  @Column(name = "size_name")
	    private String size_name;


}
